Overview
This Java program calculates the area, perimeter, and volume of different geometric shapes based on user input. It follows Object-Oriented Programming (OOP) principles, utilizing:
- Abstract classes (Shape)
- Interfaces (Volume)
- Encapsulation and Inheritance

The program offers a menu-driven interface where users can select a shape and enter dimensions to compute required values.

Features
- Supports 2D Shapes:
  - Circle
  - Rectangle
  - Square
- Supports 3D Shapes:
  - Sphere
  - Cylinder
  - Square Pyramid
- Implements an abstract class (Shape) with an abstract method for area, perimeter, and volume.
- Uses polymorphism to calculate different shape properties dynamically.

Technologies Used
- Java (Object-Oriented Programming)
- Scanner Class (User Input Handling)

Installation and Usage:
Prerequisites
Ensure you have Java IDK installed on your system.

Steps to Run the Program
1. Compile the Java files: javac Main.java
2. Run the program: java Main
   

Example Usage
Select a Shape to Calculate:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Square Pyramid
7. Exit
Enter your choice: 1
Enter radius of the circle: 5
Area: 78.5 sq units
Perimeter: 31.4 units
Volume: 0 cubic units

File Structure

ShapeCalculator/
│── Main.java         # Main menu-driven logic
│── Shape.java        # Abstract class defining shape properties
│── Circle.java       # Class for Circle calculations
│── Rectangle.java    # Class for Rectangle calculations
│── Square.java       # Class for Square calculations
│── Sphere.java       # Class for Sphere calculations
│── Cylinder.java     # Class for Cylinder calculations
│── SquarePyramid.java # Class for Square Pyramid calculations
│── README.md         # Project Documentation



