package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
   
        setSize(620,735);
        setTitle("TicTacToe");
        setResizable(false);
        setLocationRelativeTo(null);
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        Image icon = Toolkit.getDefaultToolkit().getImage("unnamed.png");  
		setIconImage(icon);
    }
}
