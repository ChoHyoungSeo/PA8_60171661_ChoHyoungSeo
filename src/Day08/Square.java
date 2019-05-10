/* 융합소프트웨어학부
 * 60171661
 * 조형서
 * 
 */

package Day08;

public class Square extends Shape {
	double width;

	public void draw() {
		System.out.println("Square" + "(" + x + "," + y + ")-(" + (x + width) + "," + (y + width) + ")");
	}

	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
	}

	public double getArea() {
		double area = width * width;
		return area;
	}

	public double getlength() {
		double length = 4 * width;
		return length;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}

}