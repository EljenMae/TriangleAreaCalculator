# 🔺 Triangle Area Calculator (Java)

## 📌 Project Overview

The **Triangle Area Calculator** is a Java console application designed to help learners progress from **basic to expert-level Java concepts**.  
The program calculates the area of a triangle using user-provided **width (base)** and **height**, while gradually introducing better logic, validation, and control structures.

This repository contains **three versions** of the calculator:

- **Basic Version** – formula calculation only
- **Intermediate Version** – input validation using `if-else` and logical OR (`||`)
- **Expert Version** – menu-based control flow using `switch-case`

---

## 🧮 Formula Used

All versions use the standard triangle area formula:


---

## 🚀 Features

### ✅ Basic Version
- Accepts user input for width and height
- Calculates the triangle area
- Displays the result in the console
- Focuses on basic Java syntax

### ✅ Intermediate Version
- Uses `if-else` statements
- Validates user input
- Prevents calculation if **width OR height equals 0**
- Displays error messages for invalid input

### ✅ Expert Version
- Uses a menu-driven system
- Implements `switch-case` statements
- Allows users to choose actions (calculate area, exit)
- Demonstrates structured program flow
- More scalable and maintainable logic

---

## 🛠️ Technologies Used
- Java
- IntelliJ IDEA (or any Java IDE)
- Command Line Interface (CLI)

---

## 📂 Project Structure
---
TriangleAreaCalculator/
│── src/
│ ├── TriangleAreaCalculator.java
│ ├── IntermediateTriangleAreaCalculator.java
│ └── ExpertTriangleAreaCalculator.java
│── README.md

---

## ▶️ How to Run the Program

### 1️⃣ Clone the repository
```bash
gh repo clone EljenMae/TriangleAreaCalculator
```

## 2️⃣ Open the project
- Open the project in your preferred Java IDE (e.g., IntelliJ IDEA)
- Navigate to the src folder

## 3️⃣ Run a version
- TriangleAreaCalculator.java → Basic
- IntermediateTriangleAreaCalculator.java → Intermediate
- ExpertTriangleAreaCalculator.java → Expert
Follow the on-screen instructions.

## 🧑‍💻 Sample Input (Basic Version)
-- Welcome to Basic Triangle Area Calculator --
- Enter width: 10
- Enter height: 5

## 📤 Sample Output (Basic Version)
The area of the triangle is: 25.0

## ⚠️ Input Validation (Intermediate Version)
The IntermediateTriangleAreaCalculator validates input using an if-else statement with the logical OR (||) operator.

## 🔎 Validation Rule
If width == 0 OR height == 0, the calculation is stopped.

## 💡 Example Logic
if (width == 0 || height == 0) {
    System.out.println("Width or height cannot be zero.");
} else {
    double area = (width * height) * 0.5;
    System.out.println("The area of the triangle is: " + area);
}

## 🧠 Expert Version (Using switch-case)
The ExpertTriangleAreaCalculator uses a menu-based approach controlled by a switch-case statement.

## 📋 Example Menu
1. Calculate Triangle Area
2. Exit

## 🧩 Example Logic
switch (choice) {
    case 1:
        // ask for width and height
        // calculate and display area
        break;
    case 2:
        System.out.println("Exiting program...");
        break;
    default:
        System.out.println("Invalid choice.");
}

## 📘 What This Teaches
- How switch-case works
- Better program structure
- How to build scalable console applications
- Cleaner control flow compared to multiple if-else blocks

## 📚 Learning Objectives
- Use Scanner for user input
- Apply arithmetic operations
- Use if-else statements
- Apply logical OR (||) for validation
- Implement switch-case for menu systems
- Write clean and readable Java code
- Understand program flow from beginner to expert level

## ✅ Future Improvements
- Validate negative numbers
- Support decimal input using double
- Loop menus using while
- Add exception handling (try-catch)
- Create a GUI version using JavaFX or Swing

## 📄 License
This project is created for educational purposes and is free to use, modify, and improve.

⭐ Feel free to fork this repository, explore each version, and enhance the project as you continue learning Java!
