package toe.tac.tic;

import javax.swing.*;
import java.awt.*;


public class StartJFrame extends JFrame{

	public StartJFrame() {
		setSize(600, 735);
		setTitle("Main Menu");
		setResizable(false);
		setLocationRelativeTo(null);
		StartPanel startPanel = new StartPanel();
		add(startPanel);

<<<<<<< HEAD
		Image icon = Toolkit.getDefaultToolkit().getImage("unnamed.png");  
=======
		Image icon = Toolkit.getDefaultToolkit().getImage("/Users/kavit/Downloads/tic-tac-toe (1).png");
>>>>>>> 7ec6372499c6fb8d132affb26561fcf6d1db2428
		setIconImage(icon);
	}
}
