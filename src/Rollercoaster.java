import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("How tall are you in inches?");
		int b = Integer.parseInt(a);
		if (b>=48) {
			JOptionPane.showMessageDialog(null, "You can ride the rollercoaster.");
		}
		else if (b<=47) {
			JOptionPane.showMessageDialog(null, "Sorry you can't ride the rollercoaster you need to be taller.");
		}
	}

}
