package toe.tac.tic;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class WinFrame extends JFrame {
	public WinFrame()  {
        setTitle("TicTacToe");
        setSize(480,300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        WinPanel winPanel = new WinPanel();
        add(winPanel);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Robertinho\\eclipse-workspace\\KolkoKrzyzyk\\src\\unnamed.png");  
		setIconImage(icon);
	}
}
