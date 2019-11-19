package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static toe.tac.tic.Main.nickNameFrame;
import static toe.tac.tic.Main.startJFrame;

class StartPanel extends JPanel {

	private BufferedImage img;
	private ImageIcon playIcon = new ImageIcon("src/play.png");
	private ImageIcon exitIcon = new ImageIcon("src/exit.png");
	
	private static JButton play, exit;
	private JLabel gameName, question;
	
	StartPanel() {
		setLayout(null);
		try {
			img = ImageIO.read(new File(
					"src/swords.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		gameName = new JLabel("TicTacToe", SwingConstants.CENTER);
		gameName.setBounds(100, 20, 400, 100);
		gameName.setFont(gameName.getFont().deriveFont(70f));
		
		question = new JLabel("Do you want to play a game?", SwingConstants.CENTER);
		question.setBounds(50, 320, 500, 100);
		question.setFont(question.getFont().deriveFont(35f));

		play = new JButton(playIcon);
		play.setBounds(135, 520, playIcon.getIconWidth(), playIcon.getIconHeight());
		play.setBorder(null);
		play.setContentAreaFilled(false);
		play.addActionListener(e -> {
			nickNameFrame.setVisible(true);
			startJFrame.setVisible(false);
		});

		exit = new JButton(exitIcon);
		exit.setBounds(335, 520, exitIcon.getIconWidth(), exitIcon.getIconWidth());
		exit.setBorder(null);
		exit.setContentAreaFilled(false);
		exit.addActionListener(e -> { System.exit(0); });

		add(play);
		add(exit);
		add(gameName);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 75, 80, 450, 450, null);
	}
	
}
