package metoder;

public class Konto {

	private static double r�nta =0.1;
	private String name="";
	private double saldo=0;

	public Konto(String n,double s) {

		System.out.println("Du har nu skapat ett konto");


		name=n;
		saldo=s;


	}
	public static void setR�nta(double r) {

		r�nta=r;

	}


	public void �rsR�nta() {

		saldo =saldo *(r�nta+1);


	}



	public void �kaSaldo(double ins�ttning) {

		saldo=saldo+ins�ttning;
	}

	public Double getSaldo() {

		return saldo;
	}


	public static void main(String[] args) {


		Konto k1=new Konto("daniel",43);
		k1.�kaSaldo(100);


		k1.setR�nta(0.2);


		k1.�rsR�nta();

		Konto k2=new Konto("evert",100);


		k1.�kaSaldo(100);

		System.out.println(k1.getSaldo());

		System.out.println(k2.getSaldo());

	}
}
