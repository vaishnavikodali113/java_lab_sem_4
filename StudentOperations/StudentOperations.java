import java.util.*;

public class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }	
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
    }
	for (Student student : students) {
            student.display();
        }
    }
   
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPrn() == prn) {
                return student;
            }
        }
        return null;
    }

}
