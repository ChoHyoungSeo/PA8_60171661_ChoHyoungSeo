/* ���ռ���Ʈ�����к� 
 * 60171661
 * ������
 * 
 */

package Day08;

public class Triangle extends Shape { // shape�� ��ӹ޴� triangleŬ���� ����.
	double height;
	double bottom;

	public void draw() {
		System.out.println("Triangle" + "(" + x + "," + y + ")-(" + (x - bottom / 2) + "," + (y - height) + ")-("
				+ (x + bottom / 2) + "," + (y - height) + ")");
	}

	public Triangle(double x, double y, double height, double bottom) { // triangle�� constructor
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