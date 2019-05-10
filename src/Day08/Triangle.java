/* 융합소프트웨어학부 
 * 60171661
 * 조형서
 * 
 */

package Day08;

public class Triangle extends Shape { // shape를 상속받는 triangle클래스 선언.
	double height;
	double bottom;

	public void draw() {
		System.out.println("Triangle" + "(" + x + "," + y + ")-(" + (x - bottom / 2) + "," + (y - height) + ")-("
				+ (x + bottom / 2) + "," + (y - height) + ")");
	}

	public Triangle(double x, double y, double height, double bottom) { // triangle의 constructor
		super(x, y);
		this.height = height;
		this.bottom = bottom;
	}

	public double getArea() {
		double area = (bottom * height) / 2;
		return area;
	}

	@Override
	public double getlength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}