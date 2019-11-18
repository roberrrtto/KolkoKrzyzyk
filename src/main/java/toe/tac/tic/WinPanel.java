package toe.tac.tic;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class WinPanel extends JPanel {

	public WinPanel() {
		try {
			URL url = new URL("https://thumbs.gfycat.com/UnconsciousSatisfiedCamel-size_restricted.gif");

			Icon icon = new ImageIcon(url);
			JLabel label = new JLabel(icon);
			WinFrame winFrame = new WinFrame();
			winFrame.getContentPane().add(label);
		} catch (MalformedURLException url) {
			url.printStackTrace();
		}

	}
}
