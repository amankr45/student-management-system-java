package StudentManagementSystem.v2;

import java.util.*;

public class StudentManager {
    private final HashMap<Integer,Student> students = new HashMap<>();

    public void addStudent(Student student){
        if(isDuplicateId(student.getStudentID())){
            System.out.println("Student ID already exists");
            return;
        }

        if(!validation.validateID(student.getStudentID())){
            System.out.println("Invalid Student ID");
            return;
        }

        if(!validation.validateName(student.getFirstName())){
            System.out.println("Invalid First Name");
            return;
        }

        if(!validation.validateName(student.getLastName())){
            System.out.println("Invalid Last Name");
            return;
        }

        if(!validation.validateAge(student.getStudentAge())){
            System.out.println("Invalid Age");
            return;
        }

        if(!validation.validateCourseName(student.getCourseName())){
            System.out.println("Invalid Course Name");
            return;
        }

        students.put(student.getStudentID(),student);
        System.out.println("Student details added Successfully");
    }

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No Students Found");
            return;
        }
        for(Student student : students.values()){
            System.out.println(student);
            System.out.println("-----------------------------------");
        }
    }

    public Student findStudentById(int id){
        return students.get(id);
    }

    public void removeStudentByID(int id){
        Student removeStudent = students.remove(id);

        if(removeStudent != null) {
            System.out.println("Student details deleted Successfully");
        }else{
            System.out.println("Student not found");
        }
    }

    public void updateStudentByID(int id, Scanner sc){
        Student student = students.get(id);

        if(student == null){
            System.out.println("Student not Found");
            return;
        }

        boolean updateMenu = true;
        while(updateMenu){

            System.out.println("""
                ----------- Update Menu -----------

                1. Update First Name
                2. Update Last Name
                3. Update Age
                4. Update Course
                5. View Current Details
                6. Exit

                """);

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter New First Name : ");
                    String firstName = sc.nextLine();
                    if(!validation.validateName(firstName)){
                        System.out.println("Invalid First Name");
                        break;
                    }
                    student.setFirstName(firstName);
                    System.out.println("First Name Updated Successfully");
                    break;

                case 2:
                    System.out.print("Enter New Last Name : ");
                    String lastName = sc.nextLine();
                    if(!validation.validateName(lastName)){
                        System.out.println("Invalid Last Name");
                        break;
                    }
                    student.setLastName(lastName);
                    System.out.println("Last Name Updated Successfully");
                    break;

                case 3:
                    System.out.print("Enter New Age : ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    if(!validation.validateAge(age)){
                        System.out.println("Invalid Age");
                        break;
                    }
                    student.setStudentAge(age);
                    System.out.println("Age Updated Successfully");
                    break;

                case 4:
                    System.out.print("Enter New Course : ");
                    String course = sc.nextLine();
                    if(!validation.validateCourseName(course)){
                        System.out.println("Invalid Course");
                        break;
                    }
                    student.setCourseName(course);
                    System.out.println("Course Updated Successfully");
                    break;

                case 5:
                    System.out.println(student);
                    break;

                case 6:
                    updateMenu = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public int getTotalStudents(){
        return students.size();
    }

    private final Validation validation = new Validation();
    private boolean isDuplicateId(int id){
        return students.containsKey(id);
    }

    private final FileManager fileManager = new FileManager();
    public void saveStudents(){
        System.out.println("Student Count : " + students.size());
        fileManager.saveStudentsToFile(students);
    }

    public void loadStudents(){
        students.clear();
        students.putAll(fileManager.loadStudentsFromFile());
    }

    public void sortStudentsById(){
        ArrayList<Student> sortedStudentsById = new ArrayList<>(students.values());

        Collections.sort(sortedStudentsById, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getStudentID(), s2.getStudentID());
            }
        });

        for(Student student : sortedStudentsById){
            System.out.println(student);
            System.out.println("-----------------------------");
        }
    }

    public void sortStudentsByName() {
        ArrayList<Student> sortedStudentsByName = new ArrayList<>(students.values());

        Collections.sort(sortedStudentsByName, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
            }
        });

        for(Student student : sortedStudentsByName){
            System.out.println(student);
            System.out.println("-------------------------------");
        }
    }
}
