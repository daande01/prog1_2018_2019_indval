package egengrafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MussePigg extends JComponent {


	public MussePigg() {
		setPreferredSize(new Dimension(400, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.black);
		g.fillOval(150, 150, 100, 100);
		g.fillOval(125, 125, 50, 50);
		g.fillOval(225, 125, 50, 50);

	}

	public static void main(String[] args) {

		JFrame f = new JFrame("musse");
		f.setLayout(new FlowLayout());
		f.setContentPane(new MussePigg());
		f.setVisible(true);
		f.pack();

	}

}
