package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
	
	@Override
	public double getPerimeter() {
		return 0;
	}
	
	@Override
	public double getArea() {
		return 0;
	}
	
	@Override
	void setLength(double length) {
		this.length = length;
	}
	
	@Override
	void setWidth(double width) {
		this.width = width;
	}
}
