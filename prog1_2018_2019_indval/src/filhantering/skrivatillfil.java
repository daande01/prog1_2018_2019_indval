package filhantering;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class skrivatillfil {

	public static void main(String[] args) throws IOException {


		String[] text = {"hej","på","dig"};

		PrintWriter p= new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));


		for (int i = 0; i < text.length; i++) {

			p.println(text[i]);

		}


		p.close();


	}

}
