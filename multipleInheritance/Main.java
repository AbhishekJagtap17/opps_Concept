package multipleInheritance;

public class Main {
		public static void main(String[] args) {
			MountainBike mountainBike=new MountainBike(20, 10, 1);
			System.out.println("Gear is : "+mountainBike.getGear());
			System.out.println("Seat height is : "+mountainBike.getSeatHeight());
			System.out.println("Bike speed is : "+mountainBike.getSpeed());
			
			mountainBike.applyBrake(1);
			System.out.println("Bike new speed applying break: "+mountainBike.getSpeed());
			
			mountainBike.speedUp(10);
			System.out.println("Bike new speed after increment is  : "+mountainBike.getSpeed());
		
		
			mountainBike.canDrive();
			mountainBike.canRotateTwoWheel();
		}
}