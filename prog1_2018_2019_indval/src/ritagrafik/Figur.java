package ritagrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Figur extends JComponent {

	public static void main(String[] args) {

		JFrame frame = new JFrame("figur"); // sakpar jframe == ruta
		frame.setSize(500, 500); // sätter storlek
		frame.setContentPane(new Figur()); // skapar ett objekt av denna klass och lägger in
											// de i denna jFrame
		frame.setVisible(true);
	}

	@Override
	public void paint(Graphics g) {

		g.setColor(Color.black);
		g.fillOval(100, 100, 300, 300);
		g.setColor(Color.black);
		g.fillOval(80, 100, 100, 100);

		g.fillOval(320, 100, 100, 100);
		g.drawOval(0, 0, 100, 100);

		g.fillRect(80, 80, 20, 20);

		// g.fillOval(100, 200, 50, 50);
		super.paint(g);
	}

}
