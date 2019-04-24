package shapes;

public class Square implements Shape {
	
	double x,y;
	double width;

	public Square(double x, double y, double width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return width*width;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 4*width;
	}

	@Override
	public String toString() {
		return "Square [calculateArea()=" + calculateArea() + ", calculatePerimeter()=" + calculatePerimeter() + "]";
	}
	

}
