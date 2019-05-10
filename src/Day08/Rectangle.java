package Day08;

public class Rectangle extends Shape { // shape상속받는 rectangle클래스 선언
	double h, i;

	public void draw() {
		System.out.println("Rectangle" + "(" + x + "," + y + ")-(" + (x + h) + "," + (y + i) + ")");
	}

	public Rectangle(double x, double y, double h, double i) {
		super(x, y);
		this.h = h;
		this.i = i;

	}

	public double getArea() {
		double area = h * i;
		return area;
	}

	public double getlength() {
		double length = 2 * (h + i);
		return length;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}