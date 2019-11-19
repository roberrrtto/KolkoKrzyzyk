package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
   
        setSize(600,735);
        setTitle("TicTacToe");
        setResizable(false);
        setLocationRelativeTo(null);
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Robertinho\\eclipse-workspace\\KolkoKrzyzyk\\src\\unnamed.png");  
		setIconImage(icon);
    }
}
