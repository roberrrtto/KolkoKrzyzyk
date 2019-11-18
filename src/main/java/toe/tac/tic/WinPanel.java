package toe.tac.tic;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;
import static toe.tac.tic.Main.winFrame;
import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.startJFrame;

public class WinPanel extends JPanel {
	Image image;
	static JButton winMessage;

	public WinPanel() {
		setLayout(null);
		image = Toolkit.getDefaultToolkit().createImage("win.gif");
		winMessage = new JButton();
		winMessage.setBounds(100, 210, 270, 40);
		winMessage.setFont(winMessage.getFont().deriveFont(20f));
		winMessage.addActionListener(e -> {
			winFrame.setVisible(false);
			startJFrame.setVisible(true);
		});
		add(winMessage);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}
}
