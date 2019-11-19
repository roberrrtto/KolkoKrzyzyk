package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static toe.tac.tic.Main.nickNameFrame;
import static toe.tac.tic.Main.startJFrame;

public class StartPanel extends JPanel {

	BufferedImage img; /// test>>>>>>>
	ImageIcon playIcon = new ImageIcon("src/playButton.png");
	ImageIcon exitIcon = new ImageIcon("src/exit.png");
	
	private static JButton play, exit;
	private JLabel gameName, question, vertical1, vertical2, horizontal1, horizontal2;
	
	public StartPanel() {
		
		setLayout(null);

		try {
			img = ImageIO.read(new File(
					"src/swords.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		gameName = new JLabel("Tic Tac Toe", SwingConstants.CENTER);
		gameName.setBounds(100, 20, 400, 100);
		gameName.setFont(gameName.getFont().deriveFont(70f));
		
		question = new JLabel("Do you want to play a game?", SwingConstants.CENTER);
		question.setBounds(50, 320, 500, 100);
		question.setFont(question.getFont().deriveFont(35f));

		play = new JButton(playIcon);
		play.setBounds(25, 350, playIcon.getIconWidth(), playIcon.getIconHeight());
		play.addActionListener(e -> {
			nickNameFrame.setVisible(true);
			startJFrame.setVisible(false);
		});

		exit = new JButton(exitIcon);
		exit.setBounds(450, 350, exitIcon.getIconWidth(), exitIcon.getIconWidth());
//		exit.setText("EXIT");
		exit.addActionListener(e -> { System.exit(0); });


		add(play);
		add(exit);
		add(gameName);
//		add(question);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// paints the background image and scale it to fill the entire space
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
}
