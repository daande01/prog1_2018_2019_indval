package pong;

import javax.swing.JFrame;

public class pong extends JFrame {

	public pong() {

		setContentPane(new Plan());
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new pong();

	}

}
