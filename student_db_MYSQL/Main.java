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
