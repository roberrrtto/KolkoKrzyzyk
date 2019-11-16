package toe.tac.tic;

import javax.swing.JFrame;

public class StartJFrame extends JFrame{
	
	public StartJFrame() {
		setSize(600, 735);
		setTitle("Main Menu");
		setResizable(false);
		
		StartPanel startPanel = new StartPanel();
		add(startPanel);
		
	}
	
}
