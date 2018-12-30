package lesson15;
import javax.swing.JOptionPane;
public class DialogViever {

	public static void main(String args[]) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		
		JOptionPane.showMessageDialog(null,"My name is Hal!");
		
		String a = JOptionPane.showInputDialog("What would you like me to do?");

		JOptionPane.showMessageDialog(null,"Sorry " + name + " I can't do this");

	}
	
}
