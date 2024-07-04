package shape;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 6.0);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        System.out.println();

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        System.out.println();

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());

	}

}
