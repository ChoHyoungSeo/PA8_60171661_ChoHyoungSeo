package Day08;

public class Bear implements Drawable { // drawable 을 implement한 bear클래스 선언.
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
		System.out.println("Bear"); // 이 메소드가 호출되면 먼저, Bear출력
		for (Drawable d : seo) {
			d.draw();
		}
	}
}