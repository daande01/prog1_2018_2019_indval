package filhantering;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writetofile {



	public static void main(String[] args) throws IOException {


		String[] arr= {"fddf","fddf","dfdf","dfgg"};


		PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));



		for (int i = 0; i < arr.length; i++) {


			p.println(arr[i]);


		}


		p.close();



	}



}
