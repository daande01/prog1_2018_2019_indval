

import javax.swing.JOptionPane;

public class test23 {

	public static void main(String[] args) {
	
	
		String[] buttons = { "Yes", "Yes to all", "No", "Cancel" };

	    int rc = JOptionPane.showOptionDialog(null, "Question ?", "Confirmation",
	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

	    System.out.println(rc);

	
	
	}

}
