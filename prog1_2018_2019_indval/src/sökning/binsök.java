package sökning;

public class binsök {

	public static int bin() {

		int[] tal = { 1, 3, 4, 6, 7, 9 };
		int sökt = 4;
		int start = 0;
		int slut = 5;
		int mitt = (start + slut) / 2;

		while (start <= slut) {

			if (tal[mitt] == sökt) {

				return mitt;
			} else if (sökt < tal[mitt]) {

				slut = mitt - 1;
				mitt= (start + slut) / 2;
			}else {
				start= mitt+1;
				mitt= (start + slut) / 2;

			}

		}

		return -1;

	}

	public static int lin(int sökttal) {


		int []tal= {23,4,56,8,45,6,9};


		for(int i=0;i<tal.length;i++) {

			if (sökttal==tal[i]) {
				return i;
			}

		}

		return -1;


	}

	public static void bubble() {

		int []oreda= {3,2,6,3,8,4,9,1};


		int i =0;
		while(i<oreda.length) {

			if (oreda[i+1]<oreda[i]) {

				//byt
				int temp=oreda[i];
				oreda[i]=oreda[i+1];
				oreda[i+1]=temp;


			}




		}






	}



	public static void main(String[] args) {

		int svar = binsök.bin();

		if (svar == -1) {

			System.out.println("talet fanns inte ");
		}else {

			System.out.println("talet finns på pos "+svar);

		}


		svar=binsök.lin(45);


		if (svar == -1) {

			System.out.println("talet fanns inte ");
		}else {

			System.out.println("talet finns på pos "+svar);

		}


	}

}
