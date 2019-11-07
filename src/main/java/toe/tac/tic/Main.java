package toe.tac.tic;

import java.awt.EventQueue;

import javax.swing.JFrame;


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

	// test
}