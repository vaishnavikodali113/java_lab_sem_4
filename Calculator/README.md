# Java Calculator Project

Overview
This is a simple **Java-based Calculator** program that performs basic arithmetic operations:  
1. Addition  
2. Subtraction  
3. Multiplication  
4. Division  

The program is divided into **four files**:
1. Calculator.java – Handles calculations.
2. Input.java – Manages user input.
3. Operator.java – Lets the user select an operation.
4. Main.java – Runs the program.

How It Works
1. The program asks the user for two numbers.
2. The user chooses an operation (Add, Subtract, Multiply, Divide).
3. The corresponding method from `Calculator.java` performs the calculation.
4. The result is displayed to the user.

---

Project Files Description

1. Calculator.java
- This file contains methods to perform arithmetic operations:
  - `calculateSum()` → Returns the sum of two numbers.
  - `calculateDiff()` → Returns the difference.
  - `calculatePrdt()` → Returns the product.
  - `calculateDiv()` → Handles division and checks for division by zero.

2. Input.java
- This file **collects input** from the user using `Scanner`.
- It prompts the user to enter two numbers and returns them as an array.

3. Operator.java
- This file provides a **menu** for the user to select an operation.
- Based on user input, it calls the appropriate method from `Calculator.java`.

4. Main.java
- This is the entry point of the program.
- It:
  1. Calls `Input.java` to get user input.
  2. Calls `Operator.java` to choose and perform an operation.
  3. Displays the final result.

How to Run the Program
Using Command Line (Terminal)
1. Compile all Java files:
   Compile Main.java file using javac Main.java command.
   Run the terminal 

