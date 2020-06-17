package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
	
	public Rectangle(double length, double width) {
		super(length, width);
	}
	
	@Override
	void setLength(double length) {
		this.length = length;
	}
	
	@Override
	void setWidth(double width) {
		this.width = width;
	}
	
	// will fail to compile if getPerimeter is left off because all methods must be implemented
	@Override
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
}
