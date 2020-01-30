package grafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter extends JFrame {

	JLabel l1 = new JLabel("10");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	int tal = 10;

	public Counter() {

		setLayout(new FlowLayout());

		add(l1);
		add(plus);
		add(minus);

		plus.addActionListener(e -> {

			tal++;

			l1.setText("" + tal);

		});

		minus.addActionListener(e -> {

			tal--;
			l1.setText("" + tal);

		});

		setVisible(true);
		setSize(500, 500);

	}

	public static void main(String[] args) {
		new Counter();
	}
}
