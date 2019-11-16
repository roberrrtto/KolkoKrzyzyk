package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {
	static boolean a = true;
	static boolean b = false;
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	
        	StartJFrame startJFrame = new StartJFrame();
        	startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	startJFrame.setVisible(a);
            GameFrame gameFrame = new GameFrame();
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setVisible(b);
            StartPanel.play.addActionListener(e -> {
    			if(true) {
    				a = false;
    				b = true;
    				startJFrame.setVisible(a);
    				gameFrame.setVisible(b);
    			}
    		});
        });
    }
}
