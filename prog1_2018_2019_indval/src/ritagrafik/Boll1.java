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
	private int vy=4;



	public Boll1() {

		Timer t = new Timer(40, e -> {

			move();

			repaint();

		});
		t.start();

	}

	private void move() {
		x++;
		y=y+vy;

		if(y>) {

		vy=-vy;
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
		frame.setContentPane(new Boll1()); // skapar ett objekt av denna klass och lägger in
											// de i denna jFrame
		frame.setVisible(true);
	}

}
