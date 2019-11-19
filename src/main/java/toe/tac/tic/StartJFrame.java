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


		Image icon = Toolkit.getDefaultToolkit().getImage("src/unnamed.png");  
=======
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/unnamed.png");
>>>>>>> 081ad104915775c145a21b45c4d4ee0a4991d848
		setIconImage(icon);
	}
}
