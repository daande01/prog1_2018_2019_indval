package ritagrafik;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Trafik extends JComponent{

public  Trafik() {
	this.setPreferredSize(new Dimension(200, 200));
}





@Override
protected void paintComponent(Graphics g) {

	super.paintComponent(g);

	g.setColor(Color.black);
	g.fillRect(5, 5, 30, 85);
	g.setColor(Color.RED);
	g.fillOval(10, 10, 20, 20);
	g.setColor(Color.green);
	g.fillOval(10, 60, 20, 20);



}






	public static void main(String[] args) {

		Trafik t=new Trafik();

		JFrame f = new JFrame("trafiklus");

		JButton stop=new JButton("stop");

		JPanel p=new JPanel();

		p.add(stop);
		p.add(t);


		Container c = f.getContentPane();

		c.add(p);
		f.pack();
		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}


}
