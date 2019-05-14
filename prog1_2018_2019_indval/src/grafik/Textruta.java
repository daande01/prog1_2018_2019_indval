package grafik;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Textruta extends JFrame{

	private JLabel l1;
	private JTextField t1;

	public Textruta() {

		l1=new JLabel("hej");
		t1= new JTextField(20);

		this.add(l1);
		this.add(t1);

		setLayout(new FlowLayout());

		setVisible(true);
		setSize(500, 500);

		t1.addActionListener(e->{

			l1.setText(t1.getText());

		});

	}


	public static void main(String[] args) {


		new Textruta();

	}




}
