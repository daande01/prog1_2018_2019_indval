/**
 * 
 */


import javax.swing.JOptionPane;

public class Ovn_38 {

public static void main(String[] args) {
	
	
	String s = JOptionPane.showInputDialog("ange temperatur");
	
	int max=Integer.parseInt(s);
	
	s = JOptionPane.showInputDialog("ange temperatur");
	
	int nyttv�rde= Integer.parseInt(s);
	
	max=Math.max(max, nyttv�rde);
	
	s = JOptionPane.showInputDialog("ange temperatur");
	
	 nyttv�rde= Integer.parseInt(s);
	
	max=Math.max(max, nyttv�rde);
	
	
	System.out.println(max);
	
}	
	
	
	
}
