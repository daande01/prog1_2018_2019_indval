/**
 *
 */


import javax.swing.JOptionPane;

public class Ovn_34 {

	public static void main(String [] args){



		String s = JOptionPane.showInputDialog("tid som man ringer per m�nad? i minuter");

		double tidPerM�nad=Double.parseDouble(s);

		 s = JOptionPane.showInputDialog("pris per minut");

		 double prisPerMinut=Double.parseDouble(s);

		 double totalPris=tidPerM�nad*prisPerMinut;

		 if( totalPris >= 1000){

			  totalPris=	 totalPris*0.9;

		 }


		 JOptionPane.showMessageDialog(null, "kostnaden per m�nad blir" +totalPris);


	}





}
