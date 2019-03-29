package grafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class knapp extends JFrame implements ActionListener {

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

		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public static void main(String[] args) {

		new knapp();
		new knapp();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj=e.getSource();

		if (obj== b1) {
			l1.setText("du har klickat på b1");

		}else if (obj== b2) {

			l1.setText("du har klickat på b2");
		}



	}

}
