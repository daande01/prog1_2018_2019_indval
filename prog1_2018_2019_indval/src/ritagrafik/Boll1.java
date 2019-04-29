package ritagrafik;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Boll1 extends JComponent {

	private int radie=20;
	private Color c;
	private int x=20;
	private int y=20;






	public static void main(String[] args) {

		JFrame frame =new JFrame("figur");  // sakpar jframe == ruta
		frame.setSize(500, 500);  			// sätter storlek
		frame.setContentPane(new Boll1());  // skapar ett objekt av denna klass och lägger in
											//de i denna jFrame
		frame.setVisible(true);
	}

}
