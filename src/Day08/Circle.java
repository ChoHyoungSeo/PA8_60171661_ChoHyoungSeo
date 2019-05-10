/* 융합소프트웨어학부  
 * 60171661
 * 조형서
 * 
 */

package Day08;

public class Circle extends Shape { // shape클래스를 상속받는 circle클래스 선언.
	double radius;

	public void draw() {
		System.out.println("Cicle center" + "(" + x + "," + y + ")-radius(" + radius + ")");
	}

	public Circle(double x, double y, double radius) { // circle의 constructor
		super(x, y);
		this.radius = radius;
	}

	public double getArea() { // getArea 메소드 넓이를 구합니다.
		double area = (3.141592) * (radius * radius);
		return area;
	}

	public double getlength() { // gelength 메소드로 둘레를 구합니다
		double length = (3.141592) * (2 * radius);
		return length;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}