package Polymorphism.Overloading;

public class Child extends Parent {

    void m1(){
        System.out.println("m1 child ");
    }
    void m1(int num){
        System.out.println("m1 child "+num);
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.m1("Parent");
        child.m1();
        child.m1(20);
    }
}