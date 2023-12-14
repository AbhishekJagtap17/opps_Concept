package Inheritance;

public class Class_A {
    static {
        System.out.println("Static block constructor A");
    }

    {
        System.out.println("Instance block constructor A");
    }

    Class_A() {
        System.out.println("A class Constructor");
    }
}
class Class_B extends Class_A {
    static {
        System.out.println("Static block constructor B");
    }

    {
        System.out.println("Instance block constructor B");
    }

    Class_B() {
        System.out.println("B class Constructor");
    }

    public static void main(String[] args) {

        Class_A class_a = new Class_B();

    }
}
