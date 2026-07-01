package com.aman.studentmanagementsystem.console;

import com.aman.studentmanagementsystem.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentPrinter {

    public void printStudent(Student student) {
        System.out.println(student);
    }

    public void printStudents(List<Student> students) {
        if (students.isEmpty()) {
            printFailure("No students found.");
            return;
        }

        students.forEach(System.out::println);
    }

    public void printSuccess(String message) {
        System.out.println();
        System.out.println("====================================");
        System.out.println("SUCCESS");
        System.out.println("------------------------------------");
        System.out.println(message);
        System.out.println("====================================");
        System.out.println();
    }

    public void printFailure(String message) {
        System.out.println();
        System.out.println("====================================");
        System.out.println("ERROR");
        System.out.println("------------------------------------");
        System.out.println(message);
        System.out.println("====================================");
        System.out.println();
    }
}