package arrays;

import java.util.Arrays;

public class Arrtest3 {


	public static void main(String[] args) {


		int [] a= {1,2,3,4,5};
		int[]  b= {1,2,3,4,5};

		int [] c= new int[5];


		for (int i = 0; i < c.length; i++) {

			c[i]=a[i]+b[i];

		}


		System.out.println(Arrays.toString(c));




	}


}
