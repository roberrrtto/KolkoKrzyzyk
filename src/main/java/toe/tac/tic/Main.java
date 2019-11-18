package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {

	static StartJFrame startJFrame = new StartJFrame();
	static GameFrame gameFrame = new GameFrame();
	static NickNameFrame nickNameFrame = new NickNameFrame();

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			startJFrame.setVisible(true);
        	gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setVisible(false);

			nickNameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			nickNameFrame.setVisible(true);
		});
    }
}

// <div>Icons made by <a href="https://www.flaticon.com/authors/pixelmeetup" title="Pixelmeetup">Pixelmeetup</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>

/*
Apps/games:

Place the attribution on the credits/description page of the application.
 */

/*
IKONA:

<div>Icons made by <a href="https://www.flaticon.com/authors/roundicons" title="Roundicons">Roundicons</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div>
 */