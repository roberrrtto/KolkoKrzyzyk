package toe.tac.tic;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setSize(600,735);
        setTitle("TicTacToe");
        setResizable(false);

        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
    }
}
