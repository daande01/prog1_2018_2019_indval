package metoder;

import javax.swing.JOptionPane;

public class Metoder5 {




	public static void main(String[] args) {


		String a=JOptionPane.showInputDialog("ange sida a");
		int sidaa=Integer.parseInt(a);

		String b=JOptionPane.showInputDialog("ange sida b");
		int sidab=Integer.parseInt(b);

		String c=JOptionPane.showInputDialog("ange sida c");
		int sidac=Integer.parseInt(c);


		int vol=volymRätblock(sidaa,sidab,sidac);




	}


	public static int volymRätblock(int a,int b, int c) {

		int v = a*b*c;




		return v ;
	}






}
