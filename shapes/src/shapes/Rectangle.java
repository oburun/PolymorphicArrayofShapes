package shapes;

public class Rectangle implements Shape {
	
	double x, y;
	double height, width;

	public Rectangle(double x, double y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return height*width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(height+width);
	}

	@Override
	public String toString() {
		return "Rectangle [calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	

}
