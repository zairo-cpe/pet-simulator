package test;
import javax.swing.JOptionPane;

public class Interface {
	
	public static void main( String[] args) {
		
		
		//variables
		String name;
		
		//objects
		event ee = new event();
		
		//naming
		name = JOptionPane.showInputDialog(null, "\nHello! \nWhat would you like to name your animal?");
		JOptionPane.showMessageDialog(null, "Ok, " + name + " it is!");
		ee.start();
		
	}

}
