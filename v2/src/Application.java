package StudentManagementSystem.v2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        manager.loadStudents();

        while(true){
            System.out.println("------------- Main Menu -------------");
            System.out.println(
                    """
                    1.) Add Student\s
                    2.) View Student\s
                    3.) Find Student By ID\s
                    4.) Delete Student By ID\s
                    5.) Update Student Data\s
                    6.) Total Number of Students\s
                    7.) Sort By ID\s
                    8.) Sort By Name\s
                    9.) Exit
                    """
            );

            try{
                System.out.println("Enter option : ");
                int option = sc.nextInt();

                switch(option){
                    case 1:
                        System.out.println("Enter ID : ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Enter First Name : ");
                        String firstName = sc.nextLine();

                        System.out.println("Enter Last Name : ");
                        String lastName = sc.nextLine();

                        System.out.println("Enter age : ");
                        int age = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Enter Course Name : ");
                        String courseName = sc.nextLine();

                        Student student = new Student(id,firstName,lastName,age,courseName);
                        manager.addStudent(student);
                        break;

                    case 2:
                        manager.viewStudents();
                        break;

                    case 3:
                        System.out.println("Enter ID : ");
                        int findStudentDetailsByID = sc.nextInt();

                        sc.nextLine();

                        Student foundStudent = manager.findStudentById(findStudentDetailsByID);
                        if(foundStudent == null){
                            System.out.println("Student Not Found");
                        }else{
                            System.out.println("Student Found");
                            System.out.println("Student Details : " + foundStudent);
                        }
                        break;

                    case 4:
                        System.out.println("Enter ID : ");
                        int deleteStudentByID = sc.nextInt();
                        sc.nextLine();

                        Student deleteStudent = manager.findStudentById(deleteStudentByID);

                        if(deleteStudent == null){
                            System.out.println("Student Not Found");
                        }else{
                            System.out.println(deleteStudent);
                            manager.removeStudentByID(deleteStudentByID);
                        }
                        break;

                    case 5:
                        System.out.println("Enter ID : ");
                        int updateStudentDetailsById = sc.nextInt();
                        sc.nextLine();

                        manager.updateStudentByID(updateStudentDetailsById, sc);
                        break;

                    case 6:
                        int totalStudents = manager.getTotalStudents();
                        System.out.println("Total Number of Students : " + totalStudents);
                        break;

                    case 7:
                        manager.sortStudentsById();
                        break;

                    case 8:
                        manager.sortStudentsByName();
                        break;

                    case 9:
                        manager.saveStudents();
                        System.out.println("Exit");
                        return;

                    default:
                        System.out.println("Invalid Option");
                }

            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine();
            }
        }
    }
}
