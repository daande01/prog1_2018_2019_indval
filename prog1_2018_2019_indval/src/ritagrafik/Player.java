package ritagrafik;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Player extends JComponent implements KeyListener {  // detta player objekt är en jcomponent och vi vill kunna hanter knapptryckningar med en metod som heter keyPressed

	private int x = 500 / 2; // instansvariabler
	private int y = 440;  // instansvariabler
	private int h = 5;     // instansvariabler
	private int w = 50;     // instansvariabler

	public Player() { // konstruktor som körs vi skapandet av ett objekt

		this.addKeyListener(this);// lägger till lyssnare på de aktuella objeket



	}

	@Override
	protected void paintComponent(Graphics g) {  // som används för för att rita ut komponenter
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillRect(x, y, w, h);// ritar rektangel (xled,yled,bredd,höjd)


	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("player plate");// skapar ramen (fönstret)
		frame.setContentPane(new Player()); // lägger till vårt player objekt i arbetsytan på fönstret

		// måste ligga i denna ording annars fungerar inte tangen lyssningen

		frame.setSize(500, 500);// sätter storlekt på fönstret

		frame.setVisible(true); // att framen skall vara synlig
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stäng programet om man kryssar de
	}

	@Override
	public void keyPressed(KeyEvent e) {  // metod som hanterar knapptryckningar
		// TODO Auto-generated method stub



		int key = e.getKeyCode();// hämtar vilken tangent man tryckt på
		if (key==KeyEvent.VK_RIGHT) {// jämför hämtad tangent med olika tangenter i detta fall höger piltangent

			x++;  // ökar på x värdet för playerplattan
			System.out.print("right");
			repaint();// ritar ut plattan på dess nya position
		}if (key == KeyEvent.VK_LEFT) {

			x--;// minskar på x värdet för playerplattan
			System.out.print("left");
			repaint();// ritar ut plattan på dess nya position

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
