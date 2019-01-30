package listor;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Lista1 {

	public static void main(String[] args) {

		List<Integer> tal = new LinkedList<Integer>();

		tal.add(3);
		tal.add(5);
		tal.add(6);
		tal.add(7);
		tal.add(46);

		System.out.println(tal);

		int i=JOptionPane.showConfirmDialog(null,"vill du lägga till ett tal");


		if(i==0) {

			String extratal=JOptionPane.showInputDialog("ange ett tal");

			int numbertoadd= Integer.parseInt(extratal);

			String posString= JOptionPane.showInputDialog("ange pos");

			int pos=Integer.parseInt(posString);

			tal.add(pos, numbertoadd);

		}

		System.out.println(tal);

	}

}
