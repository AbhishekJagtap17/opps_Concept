package abstraction;

public class Rectangle extends GraphicObject{
		@Override
		void draw() {
				System.out.println("Drawing Rectangle");
		}
		@Override
		void resize() {
			System.out.println("Resizing Rectangle");
		
		}
}
