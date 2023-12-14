package Encapsulation;


public class Student {
    private int studentId;
    private String studentName;
    private String  studentAddress;

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public String getStudentAddress(){
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }

    public static void main(String []args){
        Student s=new Student();
        s.setStudentId(10);
        s.setStudentName("Abhi");
        s.setStudentAddress("Puna");

        System.out.println("StudentID  :"+s.getStudentId());
        System.out.println("StudentName  :"+s.getStudentName());
        System.out.println("StudentAddress :"+s.getStudentAddress());
    }
}
