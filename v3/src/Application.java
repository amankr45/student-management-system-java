package StudentManagementSystem.v3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){
            System.out.println("--------------- Main Menu ---------------");
            System.out.println("""
                    1.) Add Student\s
                    2.) View Student\s
                    3.) Find Student By ID\s
                    4.) Delete Student By ID\s
                    5.) Update Student Data\s
                    6.) Total Number of Students\s
                    7.) Sort By Id\s
                    8.) Sort By Name\s
                    9.) Exit
                    """);

            try{
                System.out.println("Enter option : ");
                int option = sc.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Enter ID : ");
                        int studentID = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter First Name : ");
                        String firstName = sc.nextLine();

                        System.out.println("Enter Last Name : ");
                        String lastName = sc.nextLine();

                        System.out.println("Enter Student Age : ");
                        int studentAge = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Course : ");
                        String courseName = sc.nextLine();

                        Student student = new Student(studentID,firstName,lastName,studentAge,courseName);
                        manager.addStudent(student);
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        System.out.println("Enter ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        Student foundStudent = manager.findStudentById(id);
                        if(foundStudent != null){
                            System.out.println(foundStudent);
                        }else {
                            System.out.println("Student not Found");
                        }
                        break;

                    case 4:
                        System.out.println("Enter ID : ");
                        int Id = sc.nextInt();
                        sc.nextLine();

                        manager.deleteStudentById(Id);
                        break;

                    case 5:

                        System.out.println("Enter Student ID : ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        Student existingStudent = manager.findStudentById(updateId);

                        if (existingStudent == null) {
                            System.out.println("Student Not Found");
                            break;
                        }

                        System.out.println("Current Student Details:");
                        System.out.println(existingStudent);

                        System.out.println("Enter New First Name : ");
                        String newFirstName = sc.nextLine();

                        System.out.println("Enter New Last Name : ");
                        String newLastName = sc.nextLine();

                        System.out.println("Enter New Age : ");
                        int newAge = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter New Course Name : ");
                        String newCourse = sc.nextLine();

                        Student updatedStudent = new Student(
                                updateId,
                                newFirstName,
                                newLastName,
                                newAge,
                                newCourse
                        );

                        manager.updateStudent(updatedStudent);
                        break;

                    case 6:
                        System.out.println("Total Students : " + manager.getTotalStudents());
                        break;

                    case 7:
                        manager.sortById();
                        break;

                    case 8:
                        manager.sortByName();
                        break;

                    case 9:
                        System.out.println("Exit");
                        return;

                    default:
                        System.out.println("Invalid option");
                }
            }catch (InputMismatchException e ){
                System.out.println("Invalid input.Please enter numbers only.");
                sc.nextLine();
            }
        }
    }
}
