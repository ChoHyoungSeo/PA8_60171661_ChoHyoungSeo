package Day08;

public class Bear implements Drawable { // drawable �� implement�� bearŬ���� ����.
	private Drawable[] seo = new Drawable[3];

	public Bear(int x, int y, int rd) { // constructor of Bear
		Shape aa = new Square(x - rd, y - rd, rd * 2);
		Shape bb = new Circle(x - rd, y - rd, rd / 2);
		Shape cc = new Circle(x + rd, y - rd, rd / 2);

		seo[0] = aa;
		seo[1] = bb;
		seo[2] = cc;

	}

	public void draw() {
		System.out.println("Bear"); // �� �޼ҵ尡 ȣ��Ǹ� ����, Bear���
		for (Drawable d : seo) {
			d.draw();
		}
	}
}