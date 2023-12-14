package Polymorphism.Overloading;

public class FinalPrivateStaticDemo {
    private void m1(){
        System.out.println("m1 without parameter");
    }
    private void m1(String str){
        System.out.println("m1 with parameter "+str);
    }
    static void m2(){
        System.out.println("m2 wihtout parameter ");
    }
    static void m2(String str){
        System.out.println("m2 with parameter"+str);
    }
    final void m3(){
        System.out.println("m3 without parameter ");
    }
    final void m3(String str){
        System.out.println("m3 with parameter "+str);
    }

    public static void main(String[] args) {
        FinalPrivateStaticDemo ref=new FinalPrivateStaticDemo();
        ref.m1();
        ref.m1("Private");
        m2();
        m2("Static");
        ref.m3();
        ref.m1("Final");
    }
}
