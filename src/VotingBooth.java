import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("How old are you?");
		int b = Integer.parseInt(a);
		if (b >= 18) {
			JOptionPane.showInputDialog(null, "Who should the next president be?");
		} else if (b <= 17) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}

}
