/* 융합소프트웨어학부
 * 60171661
 * 조형서
 * 
 */

package Day08;

public class Text implements Drawable { // drawable을 implement하는 text클래스 선언.
	String string;

	public Text(String string) {
		this.string = string;
	}

	public void draw() {
		System.out.println(string);
	}

}