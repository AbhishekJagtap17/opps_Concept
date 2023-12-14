package Inheritance;

public class Case1 {
    public static void main(String[] args) {
        // parent class object and parent class reference : We can access only from parent class.
        Parent parent=new Parent();
        System.out.println(parent.a);
        System.out.println(parent.b);
        System.out.println(parent.c);
        System.out.println(parent.d);
    }
}
