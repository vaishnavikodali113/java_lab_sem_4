import java.util.*;

public class StudentOperations{
	ArrayList<Student> students;

	public StudentOperations(){
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		students.add(student);
		System.out.println("Student added.");
	}

	public void displayStudents(){
		for(Student student : students){
			student.display();
		}
	}
}