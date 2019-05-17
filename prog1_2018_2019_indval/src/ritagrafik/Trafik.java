package ritagrafik;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Trafik extends JComponent{


	private Color färg1=Color.GREEN;
	private Color färg2=Color.black;
	boolean state=true;
	private Timer t1;


public void stopTimer() {

	t1.stop();
}

public  Trafik() {
	this.setPreferredSize(new Dimension(200, 200));
	 t1= new Timer(1000, e->  {

		if (state==true) {

			färg1=Color.BLACK;
			färg2=Color.red;
			state=false;

		} else  {

			färg1=Color.green;
			färg2=Color.black;
			state=true;

		}


		repaint();
	});
	t1.start();
}


@Override
protected void paintComponent(Graphics g) {

	super.paintComponent(g);

	g.setColor(Color.black);
	g.fillRect(5, 5, 30, 85);
	g.setColor(färg1);
	g.fillOval(10, 10, 20, 20);
	g.setColor(färg2);
	g.fillOval(10, 60, 20, 20);



}






	public static void main(String[] args) {

		Trafik t=new Trafik();

		JFrame f = new JFrame("trafiklus");

		JButton stop=new JButton("stop");


		stop.addActionListener(e->{

			t.stopTimer();

		});


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
