package toe.tac.tic;

import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.startJFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartPanel extends JPanel {
	
	private static JButton play, exit;
	private JLabel gameName, question;
	
	public StartPanel() {
		
		setLayout(null);
		
		gameName = new JLabel("TicTacToe", SwingConstants.CENTER);
		gameName.setBounds(100, 150, 400, 100);
		gameName.setFont(gameName.getFont().deriveFont(70f));
		
		question = new JLabel("Do you want to play a game?", SwingConstants.CENTER);
		question.setBounds(50, 300, 500, 100);
		question.setFont(question.getFont().deriveFont(35f));

		play = new JButton();
		play.setBounds(150, 500, 100, 50);
		play.setText("PLAY");
		play.addActionListener(e -> {
			gameFrame.setVisible(true);
			startJFrame.setVisible(false);
		});

		exit = new JButton();
		exit.setBounds(350, 500, 100, 50);
		exit.setText("EXIT");
		exit.addActionListener(e -> { System.exit(0); });
		
		add(play);
		add(exit);
		add(gameName);
		add(question);
	}
	
}
