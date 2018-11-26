

import javax.swing.JOptionPane;

public class age {


	public static void main(String[] args) {



		String s= JOptionPane.showInputDialog("ange ålder namn skostorlek");


			s.trim();

			int mellanSlag1 =s.indexOf(" ");

			int mellanSlag2= s.lastIndexOf(" ");


			int längd= s.length();



			String namn=s.substring(mellanSlag1+1, mellanSlag2 );

			String förstaBokstav=namn.substring(0,1);

			String rest=namn.substring(1);

			förstaBokstav=förstaBokstav.toUpperCase();



			System.out.print(förstaBokstav+rest);






	}


}
