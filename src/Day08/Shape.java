/* ���ռ���Ʈ�����к�
 * 60171661
 * ������
 * 
 */
package Day08;

public abstract class Shape implements Drawable, Movable { // drawable, movable�� implement�� shapeŬ���� ����.
	double x, y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public abstract double getArea();

	public abstract double getlength();
}