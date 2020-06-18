package shapes;

public class Square extends Quadrilateral implements Measurable {
	
	public Square(double side) {
		super(side, side);
	}
	
	@Override
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double getPerimeter() {
		return 4 * this.length;
	}
	
	@Override
	public double getArea() {
		return this.length * this.length;
	}
}
