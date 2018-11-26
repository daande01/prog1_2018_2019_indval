/**
 * 
 */


import javax.swing.JOptionPane;

public class Ovn_38 {

public static void main(String[] args) {
	
	
	String s = JOptionPane.showInputDialog("ange temperatur");
	
	int max=Integer.parseInt(s);
	
	s = JOptionPane.showInputDialog("ange temperatur");
	
	int nyttvärde= Integer.parseInt(s);
	
	max=Math.max(max, nyttvärde);
	
	s = JOptionPane.showInputDialog("ange temperatur");
	
	 nyttvärde= Integer.parseInt(s);
	
	max=Math.max(max, nyttvärde);
	
	
	System.out.println(max);
	
}	
	
	
	
}
