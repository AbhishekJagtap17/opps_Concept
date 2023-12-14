package Encapsulation;

public class A {
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40;

}
class C {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.a);
       // CTE System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);
    }
}
