package grafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class knapp extends JFrame  {

	JButton b1 = new JButton("switch");
	JButton b2 = new JButton("switch");
	JLabel l1 = new JLabel("fungerar");


	public knapp() {
		setLayout(new FlowLayout());
		add(l1);
		add(b1);
		add(b2);
		setVisible(true);
		setSize(200, 200);
		b1.addActionListener(e->{

			System.out.println("du har klickat på knapp1");
		});
		b2.addActionListener(e->{

			System.out.println("du har klickat på knapp2");

		});

	}


/*
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			l1.setText("du har klickat på b1");

		} else if (e.getSource() == b2) {

			l1.setText("du har klickat på b2");
		}
	}


	*/
	public static void main(String[] args) {
		new knapp();
		new knapp();


	}
}
