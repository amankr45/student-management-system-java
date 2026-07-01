package com.aman.studentmanagementsystem;

import com.aman.studentmanagementsystem.config.AppConfig;
import com.aman.studentmanagementsystem.console.MenuPrinter;
import com.aman.studentmanagementsystem.console.StudentInputReader;
import com.aman.studentmanagementsystem.console.StudentPrinter;
import com.aman.studentmanagementsystem.constants.ErrorMessages;
import com.aman.studentmanagementsystem.constants.SuccessMessages;
import com.aman.studentmanagementsystem.exception.DuplicateStudentException;
import com.aman.studentmanagementsystem.exception.InvalidStudentException;
import com.aman.studentmanagementsystem.exception.StudentNotFoundException;
import com.aman.studentmanagementsystem.model.Student;
import com.aman.studentmanagementsystem.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StudentManagementSystemApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MenuPrinter menuPrinter = context.getBean(MenuPrinter.class);
        StudentInputReader reader = context.getBean(StudentInputReader.class);
        StudentPrinter printer = context.getBean(StudentPrinter.class);
        StudentService studentService = context.getBean(StudentService.class);

        while (true) {

            menuPrinter.printMenu();
            int choice = reader.readChoice();

            if (choice == -1) {
                printer.printFailure(ErrorMessages.INVALID_CHOICE);
                continue;
            }

            try {

                switch (choice) {

                    case 1 -> {
                        Student student = reader.readStudent();

                        if (student == null) {
                            printer.printFailure(ErrorMessages.INVALID_INPUT);
                            break;
                        }

                        int affectedRows = studentService.saveStudent(student);

                        if (affectedRows == 1) {
                            printer.printSuccess(SuccessMessages.STUDENT_ADDED);
                        } else {
                            printer.printFailure("Failed to add student. No rows affected.");
                        }
                    }

                    case 2 -> {
                        int studentId = reader.readStudentId();

                        if (studentId == -1) {
                            printer.printFailure(ErrorMessages.INVALID_INPUT);
                            break;
                        }

                        Student foundStudent = studentService.getStudentById(studentId);
                        printer.printStudent(foundStudent);
                    }

                    case 3 -> {
                        List<Student> students = studentService.getAllStudents();
                        printer.printStudents(students);
                    }

                    case 4 -> {
                        Student student = reader.readStudent();

                        if (student == null) {
                            printer.printFailure(ErrorMessages.INVALID_INPUT);
                            break;
                        }

                        int affectedRows = studentService.updateStudent(student);

                        if (affectedRows == 1) {
                            printer.printSuccess(SuccessMessages.STUDENT_UPDATED);
                        } else {
                            printer.printFailure("Failed to update student. No rows affected.");
                        }
                    }

                    case 5 -> {
                        int studentId = reader.readStudentId();

                        if (studentId == -1) {
                            printer.printFailure(ErrorMessages.INVALID_INPUT);
                            break;
                        }

                        int affectedRows = studentService.deleteStudent(studentId);

                        if (affectedRows == 1) {
                            printer.printSuccess(SuccessMessages.STUDENT_DELETED);
                        } else {
                            printer.printFailure("Failed to delete student. No rows affected.");
                        }
                    }

                    case 6 -> {
                        printer.printSuccess(SuccessMessages.APPLICATION_EXIT);
                        context.close();
                        return;
                    }

                    default -> printer.printFailure(ErrorMessages.INVALID_CHOICE);
                }

            } catch (InvalidStudentException |
                     DuplicateStudentException |
                     StudentNotFoundException e) {

                printer.printFailure(e.getMessage());

            } catch (Exception e) {
                printer.printFailure(ErrorMessages.UNEXPECTED_ERROR);
            }

            System.out.println();
        }
    }
}