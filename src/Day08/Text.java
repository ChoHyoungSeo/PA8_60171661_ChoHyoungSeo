/* ���ռ���Ʈ�����к�
 * 60171661
 * ������
 * 
 */

package Day08;

public class Text implements Drawable { // drawable�� implement�ϴ� textŬ���� ����.
	String string;

	public Text(String string) {
		this.string = string;
	}

	public void draw() {
		System.out.println(string);
	}

}