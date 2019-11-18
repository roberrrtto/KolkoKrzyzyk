package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {

	static StartJFrame startJFrame = new StartJFrame();
	static GameFrame gameFrame = new GameFrame();
<<<<<<< HEAD
	static WinFrame winFrame = new WinFrame();
=======
//	static NickNameFrame nickNameFrame = new NickNameFrame();
>>>>>>> 7ec6372499c6fb8d132affb26561fcf6d1db2428

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			startJFrame.setVisible(false);
        	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setVisible(false);
<<<<<<< HEAD
			winFrame.setVisible(false);
=======

//			nickNameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			nickNameFrame.setVisible(true);
>>>>>>> 7ec6372499c6fb8d132affb26561fcf6d1db2428
        });
    }
}
