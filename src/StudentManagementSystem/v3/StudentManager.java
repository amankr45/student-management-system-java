package StudentManagementSystem.v3;

public class StudentManager {

    private final StudentDAO studentDAO = new StudentDAO();
    private final Validation validation = new Validation();

    public void addStudent(Student student){

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

        studentDAO.addStudent(student);
    }

    public void viewStudents(){
        studentDAO.viewStudents();
    }

    public Student findStudentById(int id){
        return studentDAO.findStudentById(id);
    }

    public void updateStudent(Student student){

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

        studentDAO.updateStudent(student);
    }

    public void deleteStudentById(int id){
        studentDAO.deleteStudentById(id);
    }

    public int getTotalStudents(){
        return studentDAO.getTotalStudents();
    }

    public void sortById(){
        studentDAO.sortById();
    }

    public void sortByName(){
        studentDAO.sortByName();
    }
}
