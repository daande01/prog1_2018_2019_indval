package ritagrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll1 extends JComponent {

	private int radie = 20;
	private Color c = Color.orange;
	private int x = 20;
	private int y = 20;
	private int vy = 1;
	private int vx = 1;

	private JFrame fr;

	public Boll1(JFrame fr) {

		this.fr = fr;

		Timer t = new Timer(20, e -> {

			move();

			repaint();

		});
		t.start();

	}

	private void move() {
		x += vx;
		//vy = vy + 2;// gravitation
		y += vy;

		if (y + 2 * radie > fr.getContentPane().getHeight()) { // ner

			vy = -vy;
		}
		if(y<0) {//up

			vy=-vy;

		}


		if (x + 2 * radie > fr.getContentPane().getWidth()) { //höger

			vx = -vx;
		}
		if(x<0) {//vänster

			vx=-vx;

		}




	}

	@Override
	public void paint(Graphics g) {

		g.setColor(c);
		g.fillOval(x, y, radie * 2, radie * 2);

		super.paint(g);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("figur"); // sakpar jframe == ruta
		frame.setSize(500, 500); // sätter storlek
		frame.setContentPane(new Boll1(frame)); // skapar ett objekt av denna klass och lägger in
		// de i denna jFrame
		frame.setVisible(true);
	}

}
