package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arrtest2 {


	public static void main(String[] args) {

		readTal(10);

	}

	private static void readTal(int arrsize) {

		int[] arr = new int[arrsize];

		for (int i = 0; i < arr.length; i++) {

			String s = JOptionPane.showInputDialog("ange ett tal");

			int tal = Integer.parseInt(s);

			arr[i] = tal;
		}

		System.out.println(Arrays.toString(arr));







	}



}
