

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class upp4_1 {

	public static void main(String[] args) {


	
		
		
		String s = JOptionPane.showInputDialog("hur mycket ringer du per månad");

		int tid = Integer.parseInt(s);

		String abonnemang="";

		
		
		if (tid <= 33) {

			abonnemang = "kontantkort";

		} else if (tid > 33 && tid <= 66) {

			abonnemang = "normal";

		} else if (tid>66){

			abonnemang = "plus";

		}

		
			System.out.print("du rekomenderas ett "+abonnemang);
		
	}

}
