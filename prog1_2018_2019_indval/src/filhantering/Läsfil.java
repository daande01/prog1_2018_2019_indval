package filhantering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L�sfil {

	public static void main(String[] args)  {

		Scanner fill�sare = null;


			try {
				fill�sare = new Scanner(new File("test2.txt"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		while (fill�sare.hasNextLine()) {

			String ord = fill�sare.nextLine();
			System.out.println(ord);

		}
	}

}
