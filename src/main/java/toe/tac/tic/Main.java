package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {

	static StartJFrame startJFrame = new StartJFrame();
	static GameFrame gameFrame = new GameFrame();
	static WinFrame winFrame = new WinFrame();

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			startJFrame.setVisible(true);
        	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setVisible(false);
			winFrame.setVisible(false);
        });
    }
}
