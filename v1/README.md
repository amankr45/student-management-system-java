# Student Management System - V1

> **Version 1 of the Student Management System built using Core Java and ArrayList.**

This project is the first version of the Student Management System. The primary goal of this version is to practice **Core Java**, **Object-Oriented Programming**, and the **Collections Framework** by implementing a simple console-based CRUD application.

---

# Features

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student
* Input Validation
* Save Student Data to Text File
* Load Student Data from Text File

---

# Technologies Used

* Java 21
* Object-Oriented Programming (OOP)
* Collections Framework
* ArrayList
* File Handling
* Exception Handling

---

# Project Structure

```text
v1/
│
├── Application.java
├── Student.java
├── StudentManager.java
├── Validation.java
├── FileManager.java
└── students.txt
```

---

# Architecture

```text
Application
     │
     ▼
StudentManager
     │
     ▼
 ArrayList
     │
     ▼
FileManager
     │
     ▼
 students.txt
```

---

# Concepts Practiced

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* Collections Framework
* ArrayList
* CRUD Operations
* Loops
* Conditional Statements
* Exception Handling
* File Reading
* File Writing

---

# How to Run

Compile the project:

```bash
javac *.java
```

Run the application:

```bash
java Application
```

Or open the project in IntelliJ IDEA and run the `Application` class.

---

# Screenshots

## Add Student

![Add Student](../Screenshot/Add%20Student.png)

---

## View Students

![View Student](../Screenshot/View%20Student.png)

---

## Search Student by ID

![Search Student By ID](../Screenshot/Search%20Student%20By%20ID.png)

---

## Update Student

![Updated Name](../Screenshot/Updated%20Name.png)

---

## Delete Student

![Deleted Student Detail](../Screenshot/Deleted%20Student%20Detail.png)

---

# Learning Outcomes

Through this version, I learned:

* How to design a menu-driven console application.
* How to organize code using multiple classes.
* How to use `ArrayList` to manage objects.
* How CRUD operations work in memory.
* How to persist data using text files.
* How to apply basic Object-Oriented Programming principles.

---

# Limitations

* Data is stored in memory using `ArrayList`.
* Searching requires linear traversal (`O(n)`).
* No database integration.
* No dependency injection.
* No framework support.

These limitations are addressed in the next version by introducing `HashMap` and improved data persistence.
