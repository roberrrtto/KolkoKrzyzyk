package toe.tac.tic;

import java.net.*;
import javax.swing.*;

public class WinPanel extends JPanel {
	
	public WinPanel() throws MalformedURLException {
		URL url = new URL("https://thumbs.gfycat.com/UnconsciousSatisfiedCamel-size_restricted.gif");
        Icon icon = new ImageIcon(url);
        JLabel label = new JLabel(icon);
  
//        JFrame winFrame = new JFrame("Animation");
//        winFrame.getContentPane().add(label);
//        winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        winFrame.pack();
//        winFrame.setLocationRelativeTo(null);
//        winFrame.setVisible(false);
		
	}
}
