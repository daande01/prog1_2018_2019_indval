package metoder;




public class Metoder4 {

	public static void main(String[] args) {


		boolean returneratResultat=Metoder4.skott≈r(1920);

		System.out.println(returneratResultat);

	}

	public static boolean skott≈r(int Âr) {

		if (Âr%4==0 && Âr%100!=0 || Âr%400==0) {

			return true;

		}else {

			return false;
		}



	}





}
