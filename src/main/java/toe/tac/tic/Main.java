package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class Main {

	static StartJFrame startJFrame = new StartJFrame();
	static NickNameFrame nickNameFrame = new NickNameFrame();
	static GameFrame gameFrame = new GameFrame();
	static WinFrame winFrame = new WinFrame();

	public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	// music
        	String filePath = "src/music.wav";
        	MusicClass musicObject = new MusicClass();
        	musicObject.playMusic(filePath);
        				
			startJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			startJFrame.setVisible(true);
			nickNameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			nickNameFrame.setVisible(false);
			gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setVisible(false);
			winFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			winFrame.setVisible(false);
		});
	}
}
/*
 * Apps/games:
 * 
 * Place the attribution on the credits/description page of the application.
 * SWORDS >>> https://www.flaticon.com/free-icon/swords_1021261
 */