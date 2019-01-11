package metoder;

public class Konto {

	private static double ränta =0.1;
	private String name="";
	private double saldo=0;

	public Konto(String n,double s) {

		System.out.println("Du har nu skapat ett konto");


		name=n;
		saldo=s;


	}
	public static void setRänta(double r) {

		ränta=r;

	}


	public void årsRänta() {

		saldo =saldo *(ränta+1);


	}



	public void ökaSaldo(double insättning) {

		saldo=saldo+insättning;
	}

	public Double getSaldo() {

		return saldo;
	}


	public static void main(String[] args) {


		Konto k1=new Konto("daniel",43);
		k1.ökaSaldo(100);


		k1.setRänta(0.2);


		k1.årsRänta();

		Konto k2=new Konto("evert",100);


		k1.ökaSaldo(100);

		System.out.println(k1.getSaldo());

		System.out.println(k2.getSaldo());

	}
}
