

import javax.swing.JOptionPane;

public class age {


	public static void main(String[] args) {



		String s= JOptionPane.showInputDialog("ange �lder namn skostorlek");


			s.trim();

			int mellanSlag1 =s.indexOf(" ");

			int mellanSlag2= s.lastIndexOf(" ");


			int l�ngd= s.length();



			String namn=s.substring(mellanSlag1+1, mellanSlag2 );

			String f�rstaBokstav=namn.substring(0,1);

			String rest=namn.substring(1);

			f�rstaBokstav=f�rstaBokstav.toUpperCase();



			System.out.print(f�rstaBokstav+rest);






	}


}
