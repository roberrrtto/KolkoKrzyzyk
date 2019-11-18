package toe.tac.tic;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class StartJFrame extends JFrame{

	public StartJFrame() {
		setSize(600, 735);
		setTitle("Main Menu");
		setResizable(false);
		setLocationRelativeTo(null);
		StartPanel startPanel = new StartPanel();
		add(startPanel);

		Image icon = Toolkit.getDefaultToolkit().getImage("unnamed.png");  
		setIconImage(icon);
	}
}
