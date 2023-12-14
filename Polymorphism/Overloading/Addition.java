package Polymorphism.Overloading;

public class Addition {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add("Abhishek ","Jagtap"));
    }
   static int add(int a,int b)
   {
            return a+b;
    }
    static int add(int a,int b,int c) {
        return a+b+c;
    }
    static String add(String string1,String string2) {
        return string1+string2;
}
}
