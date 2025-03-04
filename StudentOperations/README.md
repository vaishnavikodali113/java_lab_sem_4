Student Management System

Overview
This Java-based "Student Management System" allows users to dd, search, update, delete, and display student records using an interactive menu-driven console program. The system efficiently manages student details such as name, PRN (Permanent Registration Number), department, batch, and CGPA.

Features
- Add Student: Register a new student with details like name, PRN, department, batch, and CGPA.
- Display Students: View all registered students.
- Search Student: Search students using (i) PRN and (ii) Name
- Update Student: Modify student details.
- Delete Student: Remove a student by PRN.

Classes & Functionality
1. Student.java
- Represents a student entity with the following attributes:
  - "name" (String)
  - "prn" (long)
  - "dept" (String)
  - 'batch" (String)
  - "cgpa" (double)
- Contains:
  - Constructor for initializing student details
  - Getter and setter methods
  - A `display()` method to print student details

2. StudentOperations.java
- Manages student records using an "ArrayList".
- Implements:
  - `addStudent(Student student)`: Adds a student to the list.
  - `displayStudents()`: Displays all student details.
  - `searchByPRN(long prn)`: Searches for a student by PRN.
  - `searchByName(String name)`: Searches for a student by name.
  - `updateStudent(long prn, newName, newDept, newBatch, newCgpa)`: Updates student details.
  - `deleteStudent(long prn)`: Deletes a student by PRN.

 3. Main.java
- Provides a **menu-driven interface** for users to interact with the system.
- Uses **Scanner** for user input and executes selected operations.

 How to Run
1. Compile the Java files - javac Main.java
2. Run the program - java Main
3. Follow the on-screen menu options to interact with the system.

Example Usage

MENU:
1. Add Student
2. Display Students
3. Search Student by PRN
4. Search Student by Name
5. Update Student
6. Delete Student
7. Exit
Enter choice: 1

Enter Name: John Doe
Enter PRN: 2307012345
Enter Department: CSE
Enter Batch: 2023-27
Enter CGPA: 8.5
Student added successfully.
```

## Technologies Used
- **Java** (JDK 8 or later)
- **ArrayList** for dynamic storage
- **Scanner** for user input

## Contributors
- **[Your Name]**

## License
This project is licensed under the MIT License.


