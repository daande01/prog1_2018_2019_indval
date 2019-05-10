package ritagrafik;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Player extends JComponent implements KeyListener {  // detta player objekt �r en jcomponent och vi vill kunna hanter knapptryckningar med en metod som heter keyPressed

	private int x = 500 / 2; // instansvariabler
	private int y = 440;  // instansvariabler
	private int h = 5;     // instansvariabler
	private int w = 50;     // instansvariabler

	public Player() { // konstruktor som k�rs vi skapandet av ett objekt

		this.addKeyListener(this);// l�gger till lyssnare p� de aktuella objeket



	}

	@Override
	protected void paintComponent(Graphics g) {  // som anv�nds f�r f�r att rita ut komponenter
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillRect(x, y, w, h);// ritar rektangel (xled,yled,bredd,h�jd)


	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("player plate");// skapar ramen (f�nstret)
		frame.setContentPane(new Player()); // l�gger till v�rt player objekt i arbetsytan p� f�nstret

		// m�ste ligga i denna ording annars fungerar inte tangen lyssningen

		frame.setSize(500, 500);// s�tter storlekt p� f�nstret

		frame.setVisible(true); // att framen skall vara synlig
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// st�ng programet om man kryssar de
	}

	@Override
	public void keyPressed(KeyEvent e) {  // metod som hanterar knapptryckningar
		// TODO Auto-generated method stub



		int key = e.getKeyCode();// h�mtar vilken tangent man tryckt p�
		if (key==KeyEvent.VK_RIGHT) {// j�mf�r h�mtad tangent med olika tangenter i detta fall h�ger piltangent

			x++;  // �kar p� x v�rdet f�r playerplattan
			System.out.print("right");
			repaint();// ritar ut plattan p� dess nya position
		}if (key == KeyEvent.VK_LEFT) {

			x--;// minskar p� x v�rdet f�r playerplattan
			System.out.print("left");
			repaint();// ritar ut plattan p� dess nya position

		}


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFocusTraversable() {
		return true;
	}


}
