# Student Data Entry System:

This is a Java console application for managing student records. It supports adding, displaying, searching, updating, and deleting student data. The application uses custom exceptions to ensure robust input validation and error handling.

# Features:

1] Add Student - Validates unique PRNs and valid input fields before adding.

2 Display Students - Displays all students in a readable format. Handles empty list scenarios.

3] Search Student - Search functionality includes:

By PRN

By Name

By Position (Index in the list)

4] Update Student - Locate a student by PRN and update name and age.

5] Delete Student - Remove a student using their PRN.

# Custom Exceptions Used
Each functionality includes at least two custom exceptions to improve reliability:

Functionality	Custom Exceptions

Add	DuplicatePRNException, InvalidDataException

Display	EmptyListException

Search	StudentNotFoundException, PositionOutOfRangeException, EmptyListException

Update	StudentNotFoundException, UpdateFailureException

Delete	StudentNotFoundException

# Technologies Used

Java (JDK 8 or above)

IntelliJ IDEA (Recommended IDE)

Console-based user interface

# How to Run

Open IntelliJ IDEA or your preferred Java IDE.

Create a new Java Project.

Create three classes:

Main.java

Student.java

CustomExceptions.java

Copy and paste the provided code into each file.

Run Main.java to start the application.

# Sample Interaction
pgsql
Copy
Edit

--- Student Data Entry ---
1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Choose an option: 1
Enter PRN: 1234
Enter Name: Alice
Enter Age: 20
Student added successfully.
