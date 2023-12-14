package Inheritance;

public class P1 {
    int A=1;
    int B=2;
    int C=3;
    int D=4;
    void method(){
        System.out.println("P1 method ");
    }
    P1(){
        System.out.println("P1 constructor");
    }
}
class C1 extends P1{
    int a=10;
    int b=20;
    int c=30;
    int d=40;
    void method(){
        System.out.println("C1 method ");
    }
    C1(){
        System.out.println("C1 constructor");
    }
    public static void main(String[] args) {
       P1 p1=new C1();
     /*   System.out.println(p1.a);
        System.out.println(p1.b);
        System.out.println(p1.c);
        System.out.println(p1.d);     */
        System.out.println(p1.A);
        System.out.println(p1.C);
        System.out.println(p1.B);
        System.out.println(p1.D);
        p1.method();
    }
}

