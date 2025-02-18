package shape;

public class Circle extends Shape {
	
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
