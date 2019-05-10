package ritagrafik;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Boll1 extends JComponent {

	private int radie = 20;  // instansvariabel allts� alla olika boll1 objekt kommer att f� en alldeles egen radie beh�llare.
	private Color c = Color.orange;   // instansvariabel, bollens framtida f�rg
	private int x = 20;// instansvariabel , bollens x kordinat
	private int y = 20;// instansvariabel, bollens y kordinat
	private int vy = 1;// instansvariabel, bollens hastighet i y led
	private int vx = 1;// instansvariabel, bollens hastighet i x led

	private JFrame fr;  // skapar en jframe beh�llare s� att vi kan ha en k�nner till relation till v�r jframe s� att vi kan f�reda p� exempelvis hur stor arbetsytan �r (contentpane)

	public Boll1(JFrame fr) {// konstruktor som tar i mot jframe som inparameter

		this.fr = fr;// lagra inparametern i instansvariabel f�r framtida bruk , s� att vi i framtiden kan kontrollera storleken p� arbets ytan , kan ju ha�nda att den blir st�rre om anv�ndaren drar i f�nstret

		Timer t = new Timer(20, e -> {  // timer koden inne i kroppen p� denna timer kommer att exekveras var 20 milliesekund.t�nk p� att denna timer m�ste importeras fr�n swing paketet och inte n�got annat paket d� kommer den inte att fungera.

			move(); // kallar p� metoden move som flyttar bollen och kollar s� att vi inte tr�ffar n�got

			repaint(); // ritar om allt

		});
		t.start(); // startar timern har ni inte med denna s� kommer de inte att h�nda n�got.

	}

	private void move() { // metod f�r att flytta bollen och kolla om kollition med v�gg
		x += vx;  // flyttar i x led
		//vy = vy + 2;// gravitation
		y += vy; // flyttar i y led

		if (y + 2 * radie > fr.getContentPane().getHeight()) { // kollar om vi traffar nedre kanten p� f�nstret i s� fall v�nder vi

			vy = -vy; // byter riktning
		}
		if(y<0) {//kollar om vi slott i taket.

			vy=-vy;//byter riktning

		}


		if (x + 2 * radie > fr.getContentPane().getWidth()) { //h�ger

			vx = -vx;
		}
		if(x<0) {//v�nster

			vx=-vx;

		}




	}

	@Override
	public void paint(Graphics g) {

		g.setColor(c);// s�tter f�rg
		g.fillOval(x, y, radie * 2, radie * 2);// ritar ut bollen  (Xled, yled, dimater x , diamter y )

		super.paint(g);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("figur"); // sakpar jframe == ruta
		frame.setSize(500, 500); // s�tter storlek
		frame.setContentPane(new Boll1(frame)); // skapar ett objekt av denna klass och l�gger in
		// de i denna jFrame
		frame.setVisible(true);
	}

}
