package toe.tac.tic;

import javax.swing.JFrame;

public class MyJFrameBoard extends JFrame {
	
	public MyJFrameBoard() {
		setSize(600, 635);
		setTitle("TicTacToe");
		setResizable(false);
		
		BoardPanel boardPanel = new BoardPanel();
		add(boardPanel);
	}
}