import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        String choice;

        do {
            System.out.println("\nEnter student details:");

            System.out.println("Enter name: ");
            String name = scan.nextLine();

            System.out.println("Enter PRN: ");
            int prn = scan.nextInt();
            scan.nextLine();  // Fix: Consume newline

            System.out.println("Enter Department: ");
            String Dept = scan.nextLine();

            System.out.println("Enter Batch (format YYYY-YY): ");
            String Batch = scan.nextLine();

            // Validate batch format
            while (!Batch.matches("\\d{4}-\\d{2}")) {
                System.out.println("Invalid format! Enter Batch again (YYYY-YY): ");
                Batch = scan.nextLine();
            }

            System.out.println("Enter the CGPA: ");
            double CGPA = scan.nextDouble();
            scan.nextLine();  // Fix: Consume newline

            // Create and add student
            Student student = new Student(name, prn, Dept, Batch, CGPA);
            operations.addStudent(student);

            // Ask if user wants to add another student
            System.out.println("Do you want to add another student? (yes/no): ");
            choice = scan.nextLine().trim().toLowerCase();

        } while (choice.equals("yes"));  

        System.out.println("\nAll Student Details:");
        operations.displayStudents();

    }
}
