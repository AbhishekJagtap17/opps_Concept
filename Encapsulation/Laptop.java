package Encapsulation;

public class Laptop {
    private int laptopId;
    private String laptopName;
    private int laptopPrice;

    public int getLaptopId(){
        return laptopId;
    }
    public void setLaptopId(int laptopId){
        this.laptopId=laptopId;
    }
    public String getLaptopName(){
        return laptopName;
    }
    public void setLaptopName(String laptopName){
        this.laptopName=laptopName;
    }
    public int getLaptopPrice(){
        return laptopPrice;
    }
    public void setLaptopPrice(int laptopPrice){
        this.laptopPrice=laptopPrice;
    }

    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        laptop.setLaptopId(45);
        laptop.setLaptopName("Dell");
        laptop.setLaptopPrice(50000);

        System.out.println("LaptopID  :"+laptop.getLaptopId());
        System.out.println("LaptopName :"+laptop.getLaptopName());
        System.out.println("LaptopPrice :"+laptop.getLaptopPrice());
    }
}
