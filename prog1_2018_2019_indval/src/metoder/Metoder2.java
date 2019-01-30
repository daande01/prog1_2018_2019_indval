package metoder;

import javax.swing.JOptionPane;

public class Metoder2 {

	public static String getName() {

		String name = JOptionPane.showInputDialog("ange namn ");

		return name;

	}

	public static void gånger(int k) {

		for (int i = 0; i <= 10; i++) {

			int tal = k * i;
			System.out.println(k+"*" + i + "=" + tal);
		}

	}

	public static void main(String[] args) {

		String tabell = JOptionPane.showInputDialog("ange vilken gånger tabell");
		int tab= Integer.parseInt(tabell);

		Metoder2.gånger(tab);


	}








}
