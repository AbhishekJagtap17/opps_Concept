package polymorphism.methodOverrriding;

public class Bicycle {
	 protected int gear;
	 protected int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public void setGear(int newValue) {
		gear=newValue;
	}
	public void applyBrake(int decrement) {
		speed-=decrement;
	}
	public void speedUp(int increment) {
		speed-=increment;
	}
	 
}
