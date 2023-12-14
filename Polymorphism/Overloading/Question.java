package Polymorphism.Overloading;
import Encapsulation.Student;
public class    Question {
    static void m1(Student student){
        System.out.println("Student "+student);
    }
   /* static void m1(String str){
        System.out.println("String "+str);
    }    */
    static void m1(Object obj){
        System.out.println("Object "+obj);
    }

    public static void main(String[] args) {
        m1(null);
    }
}
