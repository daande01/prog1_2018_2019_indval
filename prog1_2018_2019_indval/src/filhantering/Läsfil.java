package filhantering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Läsfil {

	public static void main(String[] args)  {

		Scanner filläsare = null;


			try {
				filläsare = new Scanner(new File("test2.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		while (filläsare.hasNextLine()) {

			String ord = filläsare.nextLine();
			System.out.println(ord);

		}
	}

}
