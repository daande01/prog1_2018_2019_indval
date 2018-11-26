/**
 *
 */


import javax.swing.JOptionPane;

public class Ovn_34 {

	public static void main(String [] args){



		String s = JOptionPane.showInputDialog("tid som man ringer per månad? i minuter");

		double tidPerMånad=Double.parseDouble(s);

		 s = JOptionPane.showInputDialog("pris per minut");

		 double prisPerMinut=Double.parseDouble(s);

		 double totalPris=tidPerMånad*prisPerMinut;

		 if( totalPris >= 1000){

			  totalPris=	 totalPris*0.9;

		 }


		 JOptionPane.showMessageDialog(null, "kostnaden per månad blir" +totalPris);


	}





}
