/* ���ռ���Ʈ�����к�  
 * 60171661
 * ������
 * 
 */

package Day08;

public class Circle extends Shape { // shapeŬ������ ��ӹ޴� circleŬ���� ����.
	double radius;

	public void draw() {
		System.out.println("Cicle center" + "(" + x + "," + y + ")-radius(" + radius + ")");
	}

	public Circle(double x, double y, double radius) { // circle�� constructor
		super(x, y);
		this.radius = radius;
	}

	public double getArea() { // getArea �޼ҵ� ���̸� ���մϴ�.
		double area = (3.141592) * (radius * radius);
		return area;
	}

	public double getlength() { // gelength �޼ҵ�� �ѷ��� ���մϴ�
		double length = (3.141592) * (2 * radius);
		return length;
	}

	@Override
	public void move(double dx, double dy) {
		// TODO Auto-generated method stub

	}
}