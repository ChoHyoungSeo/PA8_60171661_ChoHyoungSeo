/* 융합소프트웨어학부
 * 60171661
 * 조형서
 * 
 */
package Day08;

public abstract class Shape implements Drawable, Movable { // drawable, movable을 implement한 shape클래스 선언.
	double x, y;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public abstract double getArea();

	public abstract double getlength();
}