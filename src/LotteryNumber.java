import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = new Random().nextInt(100);
		int b = new Random().nextInt(100);
		int c = new Random().nextInt(100);
		int d = new Random().nextInt(100);
		int e = new Random().nextInt(100);
		JOptionPane.showMessageDialog(null, "Your lottery numbers are " + a + " " + b + " " + c + " " + d + " " + e);
	}

}