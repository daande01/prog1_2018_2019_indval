package filhantering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {



	public static void main(String[] args) throws FileNotFoundException {


		Scanner sc = new Scanner(new File("test.txt"));



		while(sc.hasNextLine()) {


			System.out.println(sc.nextLine());



		}











	}








}
