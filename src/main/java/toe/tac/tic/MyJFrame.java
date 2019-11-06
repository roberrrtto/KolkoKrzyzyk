package toe.tac.tic;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	
	public MyJFrame() {
		setSize(600, 635);
		setTitle("TicTacToe");
		setResizable(false);
		
		MyJPanel myJPanel = new MyJPanel();
		add(myJPanel);
	}
}