# Student Data Entry Application

This is a simple **Student Data Entry** application that uses **JDBC** to interact with a **MySQL database**. It allows the user to add, display, search, update, and delete student records from the database.

## Features
- **Add Student**: Adds a new student to the database.
- **Display All Students**: Lists all the students stored in the database.
- **Search Student**: Allows the user to search for students by PRN, name, or student ID.
- **Update Student**: Update an existing student's name and age by their PRN.
- **Delete Student**: Deletes a student record based on their PRN.

## Requirements
- **Java**: JDK 8 or later
- **MySQL Database**: A MySQL server installed and running
- **MySQL Connector/J**: JDBC driver for MySQL

## Setup Instructions

### 1. Set up MySQL Database

Before running the application, you need to create the required database and table in MySQL:

```sql
CREATE DATABASE student_db_entry;

USE student_db_entry;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    prn VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100),
    age INT
);
```

### 2. Download and Add MySQL JDBC Driver

Download the MySQL JDBC driver from [here](https://dev.mysql.com/downloads/connector/j/). Once downloaded, follow these steps to add it to your IntelliJ project:

1. In IntelliJ, open your project.
2. Go to **File** > **Project Structure** > **Modules** > **Dependencies**.
3. Click the **`+` (Add)** button and choose **JARs or directories**.
4. Select the MySQL JDBC `.jar` file you downloaded and click **Apply** and **OK**.

### 3. Update Database Connection Details

Update the `JDBC_URL`, `USER`, and `PASS` in the `Main.java` file to match your MySQL server configuration:

```java
static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db_entry";
static final String USER = "root"; // Replace with your MySQL username
static final String PASS = "student@123"; // Replace with your MySQL password
```

### 4. Running the Application

1. Open your project in IntelliJ.
2. Run the `Main.java` class by right-clicking on it and selecting **Run 'Main'**.

### 5. Available Operations

Once the application starts, you can choose from the following options:
- **1. Add Student**: Add a student by entering their PRN, name, and age.
- **2. Display All Students**: View the list of all students in the database.
- **3. Search Student**: Search for students by PRN, name, or ID.
- **4. Update Student**: Update a student's name and age by their PRN.
- **5. Delete Student**: Delete a student by their PRN.
- **6. Exit**: Exit the application.

### 6. Error Handling

The application includes basic error handling for the following:
- **SQLIntegrityConstraintViolationException**: This occurs when trying to insert a student with an already existing PRN.
- **SQLException**: This catches any other database-related errors.

## Example of Use:

```plaintext
--- Student Data Entry ---
1. Add Student
2. Display All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Choose an option: 1
Enter PRN: 12345
Enter Name: John Doe
Enter Age: 20
Student added successfully.
```
