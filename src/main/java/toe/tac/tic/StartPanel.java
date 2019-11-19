package toe.tac.tic;

import static toe.tac.tic.Main.nickNameFrame;
import static toe.tac.tic.Main.startJFrame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel {

	BufferedImage img; 
	ImageIcon playIcon = new ImageIcon("src/play.png");
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
//		add(question);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// paints the background image and scale it to fill the entire space
		g.drawImage(img, 75, 80, 450, 450, null);
	}
	
}
