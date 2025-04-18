# Multi-Threading Demonstration in Java

## Project Overview

This Java program demonstrates the fundamental concept of **multi-threading** using separate `.java` files. Each thread is responsible for a specific task and runs concurrently with others. The program is designed to show how parallel execution works in Java using the `Runnable` interface and `Thread` class.

The implementation follows standard Java programming guidelines:
- Modular structure using multiple Java files
- Single Responsibility Principle for each thread class
- Proper commenting for clarity
- Separation of logic into functions for maintainability

---

## File Structure

| File Name              | Description                                                               |
|------------------------|---------------------------------------------------------------------------|
| `MainThreadDemo.java`  | Contains the `main` method. Initializes and starts all the threads.       |
| `NumberPrinter.java`   | A thread class that prints numbers from 1 to 5 with delays.               |
| `CharacterPrinter.java`| A thread class that prints characters from A to E with delays.            |
| `MessagePrinter.java`  | A thread class that prints a message multiple times with delays.          |

## How It Works

- Each thread class implements the `Runnable` interface and overrides the `run()` method.
- Threads are instantiated in the main file using these classes.
- Each thread is started using the `start()` method of the `Thread` class.
- Threads execute concurrently, demonstrating the concept of multitasking.

### NumberPrinter
- Prints numbers from 1 to 5.
- Uses `Thread.sleep(500)` for a half-second pause between prints.

### CharacterPrinter
- Prints characters from A to E.
- Uses `Thread.sleep(700)` for a smoother visual output.

### MessagePrinter
- Prints a message ("Hello from thread!") five times.
- Uses `Thread.sleep(600)` for pacing the output.

## How to Compile and Run

1. Save all `.java` files in the same directory.
2. Open a terminal or command prompt in that directory.
3. Compile all files:
   ```bash
   javac *.java
   ```
4. Run the program:
   ```bash
   java MainThreadDemo
   ```

## Expected Output

The output will show interleaved lines from all three threads, such as:

```
Number: 1
Character: A
Message: Hello from thread!
Number: 2
Message: Hello from thread!
Character: B
...
```

Note that the output order may vary due to the nature of thread scheduling by the JVM.

## Key Concepts Demonstrated

- Creating and starting threads in Java
- Implementing `Runnable` interface
- Using `Thread.sleep()` to simulate time-consuming tasks
- Understanding asynchronous and parallel execution

---
