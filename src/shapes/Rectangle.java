package shapes;
 public class Rectangle extends Quadrilateral implements Measurable {
	
	@Override
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public void setWidth(double width) {
		this.width = width;
	}
	
	// will fail to compile if getPerimeter is left off because all methods must be implemented
	@Override
	public double getPerimeter() {
		return (2 * this.length) + (2 * this.width);
	}
	
	@Override
	public double getArea() {
		return this.length * this.width;
	}
}
