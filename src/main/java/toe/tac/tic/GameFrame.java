package toe.tac.tic;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setSize(500,600);
        setTitle("TicTacToe");
        setResizable(false);

        MainPanel mainPanel = new MainPanel();
        add(mainPanel);
    }
}
