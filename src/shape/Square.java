package shape;

public class Square extends Shape {
	
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
