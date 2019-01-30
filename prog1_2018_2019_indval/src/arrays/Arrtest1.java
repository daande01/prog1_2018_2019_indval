package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arrtest1 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {

			String s = JOptionPane.showInputDialog("ange ett tal");

			int tal = Integer.parseInt(s);

			arr[i] = tal;
		}

		System.out.println(Arrays.toString(arr));
	}

}



