package com.aman.studentmanagementsystem.console;

import com.aman.studentmanagementsystem.model.Student;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class StudentInputReader {

    private final Scanner scanner = new Scanner(System.in);

    public int readChoice() {
        System.out.print("Enter Choice : ");
        return scanner.nextInt();
    }

    public Student readStudent() {
        Student student = new Student();

        System.out.print("Enter Student ID : ");
        student.setStudentId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter First Name : ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name : ");
        student.setLastName(scanner.nextLine());

        System.out.print("Enter Age : ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Enter Course Name : ");
        student.setCourseName(scanner.nextLine());

        return student;
    }

    public int readStudentId() {
        System.out.print("Enter Student ID : ");
        return scanner.nextInt();
    }
}
