package Polymorphism.Overriding;

public class MessageService {
    void sendMessage(String message){
        System.out.println("Sending message using email :"+message);
    }

    public static void main(String[] args) {
        System.out.println("These will be called by JVM");
    }

    public static void main() {
        System.out.println("Overload");
    }
}
