package toe.tac.tic;

import javax.swing.*;
import java.awt.*;


public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				MyJFrame window = new MyJFrame();
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setVisible(true);
			}

		});
	}

}
// komentarz testowy