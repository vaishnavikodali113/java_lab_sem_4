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

    public Student searchByName(String name) {
         for (Student student : students) {
             if (student.getName().equalsIgnoreCase(name)) {
                 return student;
            }
        }
        return null;
    }

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

	
}
