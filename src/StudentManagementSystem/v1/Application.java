package StudentManagementSystem.v1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        manager.loadStudents();

    while (true) {
        System.out.println("--------------Main Menu-------------");
        System.out.println(
                """
                        1.) Add Student\s
                        2.) View Student\s
                        3.) Search Student By ID\s
                        4.) Delete Student\s
                        5.) Update Student Data\s
                        6.) Total Number of Students\s
                        7.) Exit
                        """
        );
            try {
            System.out.println("Enter option: ");
            int option = sc.nextInt();

                switch (option) {
                    case 1:           // Add Student
                        System.out.println("Enter Student ID : ");
                        int id = sc.nextInt();

                        sc.nextLine(); // buffer clear(because of name skipping)

                        System.out.println("Enter First Name : ");
                        String fName = sc.nextLine().trim();

                        System.out.println("Enter Last Name : ");
                        String lName = sc.nextLine().trim();

                        System.out.println("Enter Age : ");
                        int age = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Enter course : ");
                        String courseName = sc.nextLine();

                        Student student = new Student(id, fName, lName, age, courseName);

                        manager.addStudent(student);
                        break;
                    case 2:          // View Student
                        manager.viewStudents();
                        break;

                    case 3:          // Search Student By ID
                        System.out.println("Enter ID : ");
                        int searchByID = sc.nextInt();
                        manager.searchStudentByID(searchByID);
                        break;

                    case 4:         // Delete Student By ID
                        System.out.println("Enter ID : ");
                        int deleteStudentDetailsByID = sc.nextInt();
                        manager.deleteStudentByID(deleteStudentDetailsByID);
                        break;

                    case 5:         // Update Student By ID
                        System.out.println("Enter Student ID : ");
                        int Id = sc.nextInt();
                        sc.nextLine(); // buffer clear(because of name skipping)

                        Student updateStudent = manager.findStudentById(Id);

                        if(updateStudent == null){
                            System.out.println("Student not found");
                            break;
                        }

                        boolean updateMenu = true;
                        while (updateMenu){
                            System.out.println("""
                                -------- Update Menu --------
                                1. Update First Name
                                2. Update Last Name
                                3. Update Age
                                4. Update Course
                                5. View Current Details
                                6. Exit Update Menu
                                """);

                            System.out.print("Enter Choice : ");
                            int updateChoice = sc.nextInt();
                            sc.nextLine();

                            switch(updateChoice){
                                case 1:
                                    System.out.println("Enter New First name : ");
                                    String firstName = sc.nextLine();
                                    updateStudent.setFirstName(firstName);
                                    System.out.println("First Name Updated Successfully");
                                    break;

                                case 2:
                                    System.out.println("Enter New Last name : ");
                                    String lastName = sc.nextLine();
                                    updateStudent.setLastName(lastName);
                                    System.out.println("Last Name updated Successfully");
                                    break;

                                case 3:
                                    System.out.println("Enter new Age : ");
                                    int Age = sc.nextInt();
                                    sc.nextLine();
                                    updateStudent.setStudentAge(Age);
                                    System.out.println("Age Updated Successfully");
                                    break;

                                case 4:
                                    System.out.println("Enter new Course : ");
                                    String newCourse = sc.nextLine();
                                    updateStudent.setCourseName(newCourse);
                                    System.out.println("Course Updated Successfully");
                                    break;

                                case 5:
                                    System.out.println(updateStudent);
                                    break;

                                case 6:
                                    updateMenu = false;
                                    break;

                                default:
                                    System.out.println("Invalid Choice : ");
                            }
                        }
                        break;

                    case 6:         // Total Number of Students
                        int totalStudents = manager.getTotalStudents();
                        System.out.println("Total Number of Students : " + totalStudents);
                        break;

                    case 7:         // Auto Save Details and Exit from Main Menu
                        manager.saveStudents();
                        System.out.println("Exit");
                        return;

                    default:
                        System.out.println("Invalid Option");
                    }

                }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine();
            }
        }
    }
}
