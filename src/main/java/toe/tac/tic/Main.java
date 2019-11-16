package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {
	
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	
        	StartJFrame startJFrame = new StartJFrame();
        	GameFrame gameFrame = new GameFrame();
        	startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	startJFrame.setVisible(StartPanel.startFrameVisibility );
            
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setVisible(StartPanel.gameFrameVisibility);
            
           
        });
    }
}
