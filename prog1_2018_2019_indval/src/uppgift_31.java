/**
 * 
 */


import javax.swing.JOptionPane;

public class uppgift_31 {

	public static void main(String[] args) {
		
		
	
		String s =JOptionPane.showInputDialog("ange radie");
		
		double radie= Double.parseDouble(s);
		
		
		double volym=(4*Math.PI*Math.pow(radie, 3))/3;
		
		double area = 4*Math.PI*radie*radie;
		
		System.out.println("arean:"+area+"volym:"+volym);
		
		
		
		
		
		
		
	}
	
}
