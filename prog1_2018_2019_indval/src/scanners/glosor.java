package scanners;

import java.util.LinkedList;
import java.util.Scanner;

public class glosor {

	static LinkedList<String> sv = new LinkedList<String>();
	static LinkedList<String> eng = new LinkedList<String>();
	static int po�ng = 0;

	public static void main(String[] args) {

		sv.add("katt");
		eng.add("cat");
		sv.add("bil");
		eng.add("car");

		Scanner s = new Scanner(System.in);

		boolean fortg� = true;

		while (fortg�) {
			System.out.println("1 nyglosa \n 2 test \n 3 visa lista \n  4 avsluta");

			int val = s.nextInt();

			switch (val) {
			case 1:
				nyglosa();

				break;
			case 2:
				test();
				break;
			case 3:

				visaLista();
				break;
			case 4:

				fortg� = false;
				break;
			default:

				break;
			}
		}
	}

	public static void nyglosa() {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange en sv glosa");
		String svord = sc.nextLine();
		sv.add(svord);

		System.out.println("ange motsvarande eng glosa");
		String engord = sc.nextLine();
		eng.add(engord);

	}

	public static void visaLista() {

		for (int i = 0; i < sv.size(); i++) {

			System.out.println(sv.get(i) + " == " + eng.get(i) + "\n");

		}

	}

	public static void test() {

		int i = 0;

		Scanner sc = new Scanner(System.in);

		while (i < sv.size()) {

			System.out.println("ange f�ljande ord p� engelska" + sv.get(i));
			String engord = sc.nextLine();
			if (engord.equals(eng.get(i))) {
				 po�ng++;

			}

			i++;
		}

		System.out.println(po�ng+"/"+sv.size());
	}

}
