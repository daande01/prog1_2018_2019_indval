package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class boll1 extends JComponent {
	int x = 100;
	int y=100;
	int yv=3;
	static Timer t;

	public boll1() {

		this.setPreferredSize(new Dimension(400,400));
		t = new Timer(20, e -> {

			update();

		});
		t.start();
	}

	public void update() {

		x = x - 0;
		y=y+yv;
		if (y>=300) {

			yv=-yv;

		}


			this.repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillOval(x, y, 100, 100);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("test");

		f.setLayout(new FlowLayout());
		f.setContentPane(new boll1());
		f.setVisible(true);
		f.pack();

	}

}
