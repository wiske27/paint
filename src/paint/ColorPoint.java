package paint;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		setX(x);
		setY(y);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("점[" + getX() + "," + getY() + "," + this.color +"]에 그렸습니다.");
	}
	
	

}
