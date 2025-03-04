import java.util.*;
// Main class to handle menu-driven execution of student operations.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();

        while (true) {   // Display menu options
            System.out.println("\nMENU:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Delete Student");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter PRN: ");
                    long prn = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scanner.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();
                    operations.addStudent(new Student(name, prn, dept, batch, cgpa));
                    break;
                
                 case 2:
                    operations.displayStudents();
                    break;

                 case 3:
                     System.out.print("Enter PRN to search: ");
                     Student foundByPRN = operations.searchByPRN(scanner.nextLong());
                     if (foundByPRN != null) {
                         foundByPRN.display();
                     }
                     else {
                        System.out.println("Student not found.");
                        break;
                    }
                 case 4:
                    System.out.print("Enter Name to search: ");
                    Student foundByName = operations.searchByName(scanner.nextLine());
                    if (foundByName != null) {
                        foundByName.display();
                    }
                    else {
                        System.out.println("Student not found.");
                        break;
                    }

                 case 5:
                     System.out.print("Enter PRN to update: ");
                     long updatePRN = scanner.nextLong();
                     scanner.nextLine();
                     System.out.print("Enter new Name: ");
                     String newName = scanner.nextLine();
                     System.out.print("Enter new Department: ");
                     String newDept = scanner.nextLine();
                     System.out.print("Enter new Batch: ");
                     String newBatch = scanner.nextLine();
                     System.out.print("Enter new CGPA: ");
                     double newCgpa = scanner.nextDouble();
                    if (operations.updateStudent(updatePRN, newName, newDept, newBatch, newCgpa)) {
                        System.out.println("Student updated successfully.");
                    }
                    else {
                        System.out.println("Student not found.");
                        break;
                    }

                case 6:
                     System.out.print("Enter PRN to delete: ");
                     if (operations.deleteStudent(scanner.nextLong())) {
                        System.out.println("Student deleted successfully.");
                     }
                    else {
                         System.out.println("Student not found.");
                         break;
                    }

                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
