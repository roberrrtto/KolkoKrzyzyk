package toe.tac.tic;

import javax.swing.*;
import java.awt.*;


public class MainRobert {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			MyJFrameBoard window = new MyJFrameBoard();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		});
	}
}
