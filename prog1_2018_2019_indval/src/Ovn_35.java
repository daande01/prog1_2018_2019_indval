/**
 * 
 */


import javax.swing.JOptionPane;

public class Ovn_35 {

	public static void main(String[] args) {
		
		
		String s= JOptionPane.showInputDialog("ange pris ink moms");
		
		double prisInkMoms = Double.parseDouble(s);
		
		 s= JOptionPane.showInputDialog("ange procent");
		
		double momsSats = Double.parseDouble(s);
		
				
		double prisExklMoms=prisInkMoms/(1+0.01*momsSats);		
		
		double momsDel=prisInkMoms-prisExklMoms; 	
		
		
		
		
		
		
		
	}
	
	
	
	
}
