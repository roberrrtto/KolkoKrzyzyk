package toe.tac.tic;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
   
        setSize(600,735);
        setTitle("TicTacToe");
        setResizable(false);
        setLocationRelativeTo(null);
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/unnamed.png");  
		setIconImage(icon);
    }
}
