
import java.util.*;

// Class to manage student operations such as adding, searching, updating, and deleting students.
public class StudentOperations {
    private ArrayList<Student> students;

    // Constructor initializing the student list
    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
    }
	for (Student student : students) {
            student.display();
        }
    }

    // Method to search for a student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPrn() == prn) {
                return student;
            }
        }
        return null;
    }

    // Method to search for a student by name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

  // Method to update student details
	public boolean updateStudent(long prn, String newName, String newDept, String newBatch, double newCgpa) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(newName);
            student.setDept(newDept);
            student.setBatch(newBatch);
            student.setCgpa(newCgpa);
            return true;
        }
        return false;
    }

// Method to delete a student by PRN
	public boolean deleteStudent(long prn) {
        return students.removeIf(student -> student.getPrn() == prn);
    }
}

