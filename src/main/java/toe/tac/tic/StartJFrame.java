package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

class StartJFrame extends JFrame{

	StartJFrame() {
		setSize(600, 735);
		setTitle("Main Menu");
		setResizable(false);
		setLocationRelativeTo(null);
		StartPanel startPanel = new StartPanel();
		add(startPanel);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/unnamed.png");
		setIconImage(icon);
	}
}
