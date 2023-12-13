package polymorphism.methodOverrriding;

public class MountainBike extends Bicycle {
	public int seatHeight;
	
	
	
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		this.seatHeight = startHeight;
	}
	@Override
	public void setGear(int newValue) {
		 gear=newValue+2;
	}
	@Override
	public void applyBrake(int decrement) {
		speed=speed-decrement-10;
	}
	@Override
	public void speedUp(int increment) {
		speed=speed+increment+10;
	}
}
