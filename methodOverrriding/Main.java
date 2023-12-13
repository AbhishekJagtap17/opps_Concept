package polymorphism.methodOverrriding;

public class Main {
public static void main(String[] args) {
//		Bicycle bicycle=new Bicycle(1, 10);
//		
//		System.out.println("Bicycle gear is : "+bicycle.gear);
//		System.out.println("Bicycle speed is : "+bicycle.speed);
//		
//		bicycle.applyBrake(1);
//		System.out.println("Bicycle speed after applying brake is : "+bicycle.speed);

		Bicycle mountainBike=new MountainBike(3, 50, 50);
		System.out.println("MountainBike gear is : "+mountainBike.gear);
		System.out.println("MountainBike speed is "+mountainBike.speed);
		
		mountainBike.applyBrake(1);
		System.out.println("MountainBike speed after applying break is: "+mountainBike.speed);
		
		mountainBike.speedUp(10);
		System.out.println("Bike speed after speeding up is : "+mountainBike.speed);
}
}
