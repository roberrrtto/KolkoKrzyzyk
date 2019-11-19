package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.startJFrame;
import static toe.tac.tic.Main.nickNameFrame;

public class StartPanel extends JPanel {

	BufferedImage img; /// test>>>>>>>
	ImageIcon playIcon = new ImageIcon("/Users/kavit/Downloads/chevron.png");
	ImageIcon exitIcon = new ImageIcon("/Users/kavit/Downloads/exit.png");
	
	private static JButton play, exit;
	private JLabel gameName, question, vertical1, vertical2, horizontal1, horizontal2;
	
	public StartPanel() {
		
		setLayout(null);

		try {
			img = ImageIO.read(new File(
					"/Users/kavit/Downloads/swords.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		gameName = new JLabel("Tic Tac Toe", SwingConstants.CENTER);
		gameName.setBounds(100, 130, 400, 100);
		gameName.setFont(gameName.getFont().deriveFont(70f));
		
		question = new JLabel("Do you want to play a game?", SwingConstants.CENTER);
		question.setBounds(50, 320, 500, 100);
		question.setFont(question.getFont().deriveFont(35f));

		play = new JButton();
		play.setBounds(150, 500, 100, 50);
//		play.setText("PLAY");
		play.setIcon(playIcon);
		play.addActionListener(e -> {
			gameFrame.setVisible(false);
			nickNameFrame.setVisible(true);
			startJFrame.setVisible(false);
		});

		exit = new JButton(exitIcon);
		exit.setBounds(350, 500, exitIcon.getIconWidth(), exitIcon.getIconWidth());
//		exit.setText("EXIT");
		exit.addActionListener(e -> { System.exit(0); });
		ImageIcon iconVertical = new ImageIcon("/Users/kavit/Desktop/kreska-pionowa-Ver2.png");
		vertical1 = new JLabel(iconVertical);
		vertical1.setBounds(208,25,15,310);
		vertical2 = new JLabel(iconVertical);
		vertical2.setBounds(350,25,15,310);
		ImageIcon iconHorizontal = new ImageIcon("/Users/kavit/Desktop/kreska-pionowa-Ver2 copy 3.png");
		horizontal1 = new JLabel(iconHorizontal);
		horizontal1.setBounds(100,125,400,15);
		horizontal2 = new JLabel(iconHorizontal);
		horizontal2.setBounds(100,220,400,15);

//		add(vertical1);
//		add(vertical2);
//		add(horizontal1);
//		add(horizontal2);
		add(play);
		add(exit);
		add(gameName);
		add(question);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// paint the background image and scale it to fill the entire space
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
}
