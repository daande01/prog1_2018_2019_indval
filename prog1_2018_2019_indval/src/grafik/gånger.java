package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class g�nger extends JFrame {

	private JTextField t1 = new JTextField(10);
	private JTextField t2 = new JTextField(10);
	private JLabel l1 = new JLabel("*");
	private JLabel produkt = new JLabel("=   ");
	private JButton b1 = new JButton("ber�kna produkt");

	public g�nger() {

		setLayout(new FlowLayout());
		add(t1);
		add(l1);
		add(t2);
		add(produkt);
		add(b1);

		b1.addActionListener(e -> {

			String s1 = t1.getText();// h�mtar texten som anv�ndaren matat in i rutan t1
			String s2 = t2.getText(); // h�mtar texten som anv�ndaren matat in i rutan t2
			int tal1 = Integer.parseInt(s1);// string -> int
			int tal2 = Integer.parseInt(s2); // string -> int

			produkt.setText("=" + tal1 * tal2);// g�ngrar och skriver ut

		});

		setVisible(true);
		setSize(new Dimension(200, 200));

	}

	public static void main(String[] args) {

		new g�nger();

	}

}
