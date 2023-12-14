package Polymorphism.Overriding;

public class MessageserviceImpl extends MessageService{
    void sendMessage(String message){
        System.out.println("Sending message using whatsapp :"+message);
    }

    public static void main(String[] args) {
        MessageService ref=new MessageserviceImpl();
        ref.sendMessage("Child class");
    }
}
