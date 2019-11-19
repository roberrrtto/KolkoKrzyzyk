package toe.tac.tic;

import javax.swing.*;
import java.awt.*;
import static toe.tac.tic.Main.startJFrame;
import static toe.tac.tic.Main.winFrame;

class WinPanel extends JPanel {
	private Image image;
	private JButton winMessage;

	WinPanel() {
		setLayout(null);
		image = Toolkit.getDefaultToolkit().createImage("src/win.gif");
		winMessage = new JButton();
		winMessage.setBounds(100, 210, 270, 40);
		winMessage.setFont(winMessage.getFont().deriveFont(20f));
		winMessage.addActionListener(e -> {
			winFrame.setVisible(false);
			startJFrame.setVisible(true);
		});
		add(winMessage);
	}

	void setWinMessage(String winMessageText) {
		this.winMessage.setText(winMessageText);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) {
			g.drawImage(image, 0, 0, this);
		}
	}
}
