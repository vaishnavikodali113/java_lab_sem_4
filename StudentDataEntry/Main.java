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

    static void displayStudents() {
        try {
            if (students.isEmpty()) {
                throw new EmptyListException("No student records available.");
            }

            System.out.println("\n--- Student List ---");
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (EmptyListException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void searchStudent() {
        try {
            if (students.isEmpty()) throw new EmptyListException("Student list is empty.");

            System.out.println("Search by: 1) PRN  2) Name  3) Position");
            int opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 1 -> {
                    System.out.print("Enter PRN: ");
                    String prn = sc.nextLine();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getPrn().equalsIgnoreCase(prn)) {
                            System.out.println("Found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) throw new StudentNotFoundException("Student with PRN not found.");
                }

                case 2 -> {
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (Student s : students) {
                        if (s.getName().equalsIgnoreCase(name)) {
                            System.out.println("Found: " + s);
                            found = true;
                        }
                    }
                    if (!found) throw new StudentNotFoundException("Student with name not found.");
                }

                case 3 -> {
                    System.out.print("Enter Position (0 to " + (students.size() - 1) + "): ");
                    int pos = Integer.parseInt(sc.nextLine());
                    if (pos < 0 || pos >= students.size()) {
                        throw new PositionOutOfRangeException("Position out of range.");
                    }
                    System.out.println("Found: " + students.get(pos));
                }

                default -> System.out.println("Invalid option.");
            }

        } catch (EmptyListException | StudentNotFoundException | PositionOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void updateStudent() {
        try {
            System.out.print("Enter PRN of student to update: ");
            String prn = sc.nextLine();
            Student target = null;

            for (Student s : students) {
                if (s.getPrn().equalsIgnoreCase(prn)) {
                    target = s;
                    break;
                }
            }

            if (target == null) throw new StudentNotFoundException("No student found with given PRN.");

            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            System.out.print("Enter new age: ");
            int newAge = Integer.parseInt(sc.nextLine());

            if (newName.isBlank() || newAge <= 0)
                throw new UpdateFailureException("Invalid update data.");

            target.setName(newName);
            target.setAge(newAge);

            System.out.println("Student updated successfully.");
            } catch (StudentNotFoundException | UpdateFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


        
