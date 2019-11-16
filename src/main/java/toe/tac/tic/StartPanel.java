package toe.tac.tic;

import javax.swing.*;

public class StartPanel extends JPanel {
	
	static JButton play, exit;
	JLabel gameName, question;
	
	public StartPanel() {
		
		setLayout(null);

		gameName = new JLabel("TicTacTao", SwingConstants.CENTER);
		gameName.setBounds(100, 100, 400, 100);
		gameName.setFont(gameName.getFont().deriveFont(70f));
		
		question = new JLabel("Do you want to play a game?", SwingConstants.CENTER);
		question.setBounds(100, 300, 400, 100);
		question.setFont(question.getFont().deriveFont(20f));
		
		play = new JButton();
		play.setBounds(150, 500, 100, 50);
		play.setText("PLAY");
		
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