package shapes;

public class Square extends Rectangle {
	
	public double side;
	
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
	
	@Override
	public double getPerimeter() {
		return length * 4;
	}
}
