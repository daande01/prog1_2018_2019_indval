import javax.swing.JOptionPane;

public class Trycatch {


	public static void lastNameGenerator(){
		String lastName = null;
		try {
	        String fullName = JOptionPane.showInputDialog("Enter your full name");
	         lastName = fullName.split("\\s+")[1];
		}
		catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Sorry, please enter your full name separated by a space.");
	        lastNameGenerator();
	    }
	    System.out.println(lastName);



	}
	public static void main(String[] args) {

		lastNameGenerator();
	}




}
