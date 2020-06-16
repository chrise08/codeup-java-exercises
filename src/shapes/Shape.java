package shapes;

abstract class Shape {
	
	protected double length;
	protected double width;
	
	public Shape() {
	
	}
	
	public Shape(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double getLength() {
		return length;
	}
	
	abstract void setLength(double length);
	
	public double getWidth() {
		return width;
	}
	
	abstract void setWidth(double width);
}
