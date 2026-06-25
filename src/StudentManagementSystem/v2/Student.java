package StudentManagementSystem.v2;

public class Student {
    private final int studentID;
    private String firstName;
    private String lastName;
    private int studentAge;
    private String courseName;

    public Student(
            int studentID, String firstName,String lastName,
            int studentAge, String courseName
    ){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentAge = studentAge;
        this.courseName = courseName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentAge(){
        return studentAge;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    @Override
    public String toString(){
        return "Student ID : " + studentID + "\n" +
                "First Name : " + firstName + "\n" +
                "Last Name : " + lastName + "\n" +
                "Age : " + studentAge + "\n" +
                "Course : " + courseName;
    }
}

