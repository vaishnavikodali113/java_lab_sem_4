import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> running = false;
                default -> System.out.println("Invalid option.");
            }
        }
    }

    static void addStudent() {
        try {
            System.out.print("Enter PRN: ");
            String prn = sc.nextLine();

            // Check for duplicate PRN
            for (Student s : students) {
                if (s.getPrn().equalsIgnoreCase(prn)) {
                    throw new DuplicatePRNException("Student with this PRN already exists.");
                }
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age <= 0 || name.isBlank() || prn.isBlank()) {
                throw new InvalidDataException("Invalid input. Fields cannot be empty or negative.");
            }

            students.add(new Student(name, prn, age));
            System.out.println("Student added successfully.");

        } catch (DuplicatePRNException | InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
