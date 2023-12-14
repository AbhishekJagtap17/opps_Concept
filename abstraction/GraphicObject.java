package abstraction;

public abstract class GraphicObject {
		int x,y;
		void moveTo(int newX,int newY) {
			System.out.println("Move to x : "+x+ " and y :"+y);
		}
		
		abstract void draw();
		abstract void resize();
}
