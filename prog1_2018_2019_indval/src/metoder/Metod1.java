package metoder;

public class Metod1 {

	public static void printHej() {

		System.out.println("hej");

	}

	public static void summa(int f, int n) {

		f=40;

		int sum=f+n;

		System.out.println(sum);

	}

	public static double sub(double d, double c) {

		double diff= d-c;

		return diff;
	}


	public static void main(String[] args) {

			int a=12;
			int b=12;


			Metod1.summa(a,b);

				double svar=Metod1.sub(12,6);

			System.out.println(svar);
	}




}
