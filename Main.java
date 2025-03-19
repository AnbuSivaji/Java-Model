import java.util.Scanner;

class Student{
    private String stuId;
     String stuName;
   private String stuAddress;
   private String stuCourse;
    public String getStuId() {
        return stuId;
    }
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public String getStuAddress() {
        return stuAddress;
    }
    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }
    public String getStuCourse() {
        return stuCourse;
    }
    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }
    
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter the student id:");
        s.setStuId(sc.nextLine());
        System.out.println("Enter the student name:");
        s.setStuName(sc.nextLine());
        System.out.println("Enter the student address:");
        s.setStuAddress(sc.nextLine());
        System.out.println("Enter the student course:");
        s.setStuCourse(sc.nextLine());
        System.out.println("Student id:"+s.getStuId());
        System.out.println("Student name:"+s.getStuName());
        System.out.println("Student address:"+s.getStuAddress());
        System.out.println("Student course:"+s.getStuCourse());
    }
}