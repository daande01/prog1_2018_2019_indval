package scanners;

import java.util.LinkedList;
import java.util.Scanner;

public class glosor {

	static LinkedList<String> sv = new LinkedList<String>();
	static LinkedList<String> eng = new LinkedList<String>();



	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);

		System.out.println("1 nyglosa \n 2 test \n 3 visa lista");

		int val = s.nextInt();

		switch (val) {
		case 1:
			nyglosa();

			break;
		case 2:
			// test();
			break;

		default:

			break;
		}

	}

	public static void nyglosa() {

		sv.add("katt");


	}





}
