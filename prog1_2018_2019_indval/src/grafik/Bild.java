package grafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bild extends JFrame {

	JLabel l1 = new JLabel(new ImageIcon("hej"));

	public Bild() { // konstruktor utan inparameter i detta fall , heter samma som klassen. körs när
					// objektet av kalssen skapas

		setLayout(new FlowLayout());  // hur skall komonenterna läggas ut på skärmen , efter varandra.

		add(l1);  // lägg till i rutan (contentpane) (arbetsytan)

		setVisible(true);
		setSize(200, 200);


		l1.setIcon(new ImageIcon("C:\\Users\\danand004\\Desktop\\IMG_20180106_111955.jpg"));






	}

	public static void main(String[] args) {

		new Bild();

	}

}
