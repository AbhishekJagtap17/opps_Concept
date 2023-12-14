package Inheritance;

public class Case3 {
    public static void main(String[] args) {
        //Child class object and child class reference.
        //With this we can access everything from child class and  parent class (non-private,non static ,non final)

        Parent parentReference =new Child();
        System.out.println(parentReference.a);
        System.out.println(parentReference.b);
        System.out.println(parentReference.c);
        System.out.println(parentReference.d);
        parentReference.m1();
    }
}
