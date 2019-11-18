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

		Image icon = Toolkit.getDefaultToolkit().getImage("/Users/kavit/Downloads/tic-tac-toe (1).png");
		setIconImage(icon);
	}
}
