package shapes;

public class ShapesTest {
	
	public static void main(String[] args) {
		
//		Rectangle box1 = new Rectangle(5, 4);
//		Rectangle box2 = new Square(5);
//
//		System.out.println(box1.getPerimeter());
//		System.out.println(box1.getArea());
//		System.out.println(box2.getPerimeter());
//		System.out.println(box2.getArea());
		
		Measurable myShape;
		
//		myShape = new Rectangle(6, 5);
		
//		System.out.println(myShape.getPerimeter());
//		System.out.println(myShape.getArea());
		
		myShape = new Square(6);
		
		System.out.println(myShape.getPerimeter());
		System.out.println(myShape.getArea());
	}
}
