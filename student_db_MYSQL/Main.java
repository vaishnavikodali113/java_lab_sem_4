import java.sql.*;
import java.util.Scanner;

public class Main {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db_entry";
    static final String USER = "root";
    static final String PASS = "student@123";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASS)) {
            System.out.println("Connected to database successfully.");
            boolean running = true;
            while (running) {
                System.out.println("\n--- Student Data Entry ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1 -> addStudent(conn);
                    case 2 -> displayStudents(conn);
                    case 3 -> searchStudent(conn);
                    case 4 -> updateStudent(conn);
                    case 5 -> deleteStudent(conn);
                    case 6 -> running = false;
                    default -> System.out.println("Invalid option.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }

    static void addStudent(Connection conn) {
        try {
            System.out.print("Enter PRN: ");
            String prn = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            String sql = "INSERT INTO students (prn, name, age) VALUES (?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, prn);
                stmt.setString(2, name);
                stmt.setInt(3, age);
                stmt.executeUpdate();
                System.out.println("Student added successfully.");
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Student with this PRN already exists.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void displayStudents(Connection conn) {
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            boolean hasRows = false;
            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                hasRows = true;
                System.out.printf("ID: %d | PRN: %s | Name: %s | Age: %d\n",
                        rs.getInt("id"), rs.getString("prn"), rs.getString("name"), rs.getInt("age"));
            }
            if (!hasRows) System.out.println("No student records found.");
        } catch (SQLException e) {
            System.out.println("Error displaying students: " + e.getMessage());
        }
    }

    static void searchStudent(Connection conn) {
        System.out.println("Search by: 1) PRN  2) Name  3) Position (ID)");
        int choice = Integer.parseInt(sc.nextLine());
        String sql = "";
        PreparedStatement stmt = null;

        try {
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter PRN: ");
                    String prn = sc.nextLine();
                    sql = "SELECT * FROM students WHERE prn = ?";
                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, prn);
                }
                case 2 -> {
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    sql = "SELECT * FROM students WHERE name = ?";
                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, name);
                }
                case 3 -> {
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    sql = "SELECT * FROM students WHERE id = ?";
                    stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, id);
                }
                default -> {
                    System.out.println("Invalid option.");
                    return;
                }
            }
            
            try (ResultSet rs = stmt.executeQuery()) {
                boolean found = false;
                while (rs.next()) {
                    found = true;
                    System.out.printf("ID: %d | PRN: %s | Name: %s | Age: %d\n",
                            rs.getInt("id"),
                            rs.getString("prn"),
                            rs.getString("name"),
                            rs.getInt("age"));
                }
                if (!found) System.out.println("No student found.");
            }

        } catch (SQLException e) {
            System.out.println("Error searching: " + e.getMessage());
        }
    }

    static void updateStudent(Connection conn) {
        try {
            System.out.print("Enter PRN of student to update: ");
            String prn = sc.nextLine();

            System.out.print("Enter new Name: ");
            String name = sc.nextLine();
            System.out.print("Enter new Age: ");
            int age = Integer.parseInt(sc.nextLine());
