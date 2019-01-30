package metoder;

public class Metod1 {

	public static void printHej() {

		System.out.println("hej");

	}

	public static int summa(int f, int n) {

		f=40;

		int sum=f+n;

		System.out.println(sum);

		return sum;

	}

	public static double sub(double d, double c) {

		double diff= d-c;

		return diff;
	}


	public static void main(String[] args) {

			int n=12;
			int f=12;




			System.out.println(Metod1.summa(n,f));

				double svar=Metod1.sub(12,6);

			System.out.println(svar);
	}




}
