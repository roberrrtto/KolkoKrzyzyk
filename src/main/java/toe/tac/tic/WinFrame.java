package toe.tac.tic;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WinFrame extends JFrame {
	public WinFrame()  {
        setTitle("TicTacToe");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WinPanel winPanel = new WinPanel();
        add(winPanel);
        Image icon = Toolkit.getDefaultToolkit().getImage("Tic-tac-toe-512.png");  
		setIconImage(icon);
	}
}
