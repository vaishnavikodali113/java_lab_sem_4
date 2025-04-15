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
        }
