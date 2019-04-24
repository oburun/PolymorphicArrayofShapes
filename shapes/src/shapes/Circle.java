package shapes;

public class Circle implements Shape {
	
	double x,y;
	double radius;

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius);
	}

	@Override
	public String toString() {
		return "Circle [calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	

}
