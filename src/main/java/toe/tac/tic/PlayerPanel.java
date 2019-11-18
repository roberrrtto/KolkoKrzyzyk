package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel { // PlayerPanel wyświetla obu graczy + wynik

    JLabel playerX, playerO, scoreDisplay;
    private int scoreX;
    private int scoreO;

    PlayerPanel() {

        setLayout(new BorderLayout());

        playerX = new JLabel("Player 'X'", SwingConstants.CENTER);
        playerX.setPreferredSize(new Dimension(175,50));
        playerX.setFont(playerX.getFont().deriveFont(17f));
        playerX.setOpaque(true);
        playerX.setBackground(Color.ORANGE);

        scoreDisplay = new JLabel("Score: " + scoreX + "-" + scoreO, SwingConstants.CENTER);
        scoreDisplay.setPreferredSize(new Dimension(250,50));
        scoreDisplay.setFont(scoreDisplay.getFont().deriveFont(20f));
        scoreDisplay.setOpaque(true);
        scoreDisplay.setBackground(Color.LIGHT_GRAY);

        playerO = new JLabel("Player 'O'", SwingConstants.CENTER);
        playerO.setPreferredSize(new Dimension(175,50));
        playerO.setFont(playerO.getFont().deriveFont(17f));
        playerO.setOpaque(true);
        playerO.setBackground(Color.ORANGE);

        add(playerX, BorderLayout.LINE_START);
        add(scoreDisplay, BorderLayout.CENTER);
        add(playerO, BorderLayout.LINE_END);
    }

    public JLabel getScoreDisplay() {
        return scoreDisplay;
    }

    public void setScoreDisplay(JLabel scoreDisplay) {
        this.scoreDisplay = scoreDisplay;
    }

    public int getScoreX() {
        return scoreX;
    }

    public void setScoreX(int scoreX) {
        this.scoreX = scoreX;
    }

    public int getScoreO() {
        return scoreO;
    }

    public void setScoreO(int scoreO) {
        this.scoreO = scoreO;
    }
}
