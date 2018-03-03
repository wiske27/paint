package paint;

public class PaintApp {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(100);
		p1.show();
		
		Point p2 = new Point();
		p2.setX(50);
		p2.setY(50);
		p2.show();
		
		Point p3 = new Point(120, 150);
		p3.show();
		
		Point p4 = new ColorPoint(150, 150, "red");
		p4.show();
		
	}
}
