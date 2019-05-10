/* ���ռ���Ʈ�����к�
 * 60171661
 * ������
 * 
 */

package Day08;

public class ShapeTest {
	public static void main(String[] args) { // ������ main�Լ��Դϴ�.
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);

		for (Shape s : shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getlength());
		}
		Drawable[] drawables = new Drawable[5];
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("sample Text");

		drawables[4] = new Bear(100, 100, 20);
		for (Drawable d : drawables) {
			d.draw();
		}

		Shape s = new Circle(100, 100, 20);
		for (int i = 0; i < 11; i++) {
			System.out.printf("Circle (%.1f, %.1f)\n", s.x, s.y);
			s.x += 10;
			s.y += 10;

		}

	}

}