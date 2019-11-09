package toe.tac.tic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BoardPanel extends JPanel {
	GameEngine gameEngine = new GameEngine();

	JButton one, two, three, four, five, six, seven, eight, nine;
	ArrayList<JButton> buttonList = new ArrayList<>();

	boolean x = true;
	boolean winnerX = false;
	boolean winnerO = false;

	boolean oneField = false;
	boolean twoField = false;
	boolean threeField = false;
	boolean fourField = false;
	boolean fiveField = false;
	boolean sixField = false;
	boolean sevenField = false;
	boolean eightField = false;
	boolean nineField = false;
	int roundNo;

	public int getRoundNo() {
		return roundNo;
	}

	public void setRoundNo(int roundNo) {
		this.roundNo = roundNo;
	}

	public void resetAll() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException k) {
			k.printStackTrace();
		}
		 x = true;
		 winnerX = false;
		 winnerO = false;

		 oneField = false;
		 twoField = false;
		 threeField = false;
		 fourField = false;
		 fiveField = false;
		 sixField = false;
		 sevenField = false;
		 eightField = false;
		 nineField = false;

		for (JButton jb : buttonList) {
			jb.setText("");
		}
	}


	public void markField(boolean fieldName, JButton buttonName) {
		if(!fieldName) {
			if (x) {
				buttonName.setText("X");
				x = false;
			} else {
				buttonName.setText("O");
				x = true;
			}
		}
		buttonName.setFont(buttonName.getFont().deriveFont(165f));
	}

	public void isWinnerX() {
		if (one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X")) {
			winnerX = true;
			one.setContentAreaFilled(true);
			one.setForeground(Color.RED);
			two.setForeground(Color.RED);
			three.setForeground(Color.RED);
		} else if (four.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X")) {
			winnerX = true;
		} else if (seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
		} else if (one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")) {
			winnerX = true;
		} else if (two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")) {
			winnerX = true;
		} else if (three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
		} else if (one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
		} else if (seven.getText().equals("X") && five.getText().equals("X") && three.getText().equals("X")) {
			winnerX = true;
		}
		if (winnerX) {
			System.out.println("The winner is: X");
			setRoundNo(getRoundNo() +1);
			resetAll();
		}
	}
	public void isWinnerO() {
		if (one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O")) {
			winnerO = true;
			one.setForeground(Color.RED);
			two.setForeground(Color.RED);
			three.setForeground(Color.RED);
		} else if (four.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O")) {
			winnerO = true;
		} else if (seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
		} else if (one.getText().equals("O") && four.getText().equals("O") && seven.getText().equals("O")) {
			winnerO = true;
		} else if (two.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O")) {
			winnerO = true;
		} else if (three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
		} else if (one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
		} else if (seven.getText().equals("O") && five.getText().equals("O") && three.getText().equals("O")) {
			winnerO = true;
		}
//		if (winnerO) {
//			System.out.println("The winner is: O");
//			gameEngine.setWonGameO(+ 1);
//			gameEngine.setRoundNo(+ 1);
//
//			resetAll();
//		}
	}

	public BoardPanel() {
		
		setLayout(null);

		one = new JButton();
		one.setBounds(0, 0, 200, 200);
		one.setOpaque(true);
		one.addActionListener(e -> {
			markField(oneField, one);
			oneField = true;
			isWinnerX();
			isWinnerO();
		});
		
		two = new JButton();
		two.setBounds(0, 200, 200, 200);
		two.setOpaque(true);
		two.addActionListener(e -> {
			markField(twoField, two);
			twoField = true;
			isWinnerX();
			isWinnerO();
		});

		three = new JButton();
		three.setBounds(0, 400, 200, 200);
		three.setOpaque(true);
		three.addActionListener(e -> {
			markField(threeField, three);
			threeField = true;
			isWinnerX();
			isWinnerO();
		});
		
		four = new JButton();
		four.setBounds(200, 0, 200, 200);
		four.addActionListener(e -> {
			markField(fourField, four);
			fourField = true;
			isWinnerX();
			isWinnerO();
		});
		
		five = new JButton();
		five.setBounds(200, 200, 200, 200);
		five.addActionListener(e -> {
			markField(fiveField, five);
			fiveField = true;
			isWinnerX();
			isWinnerO();
		});
		
		six = new JButton();
		six.setBounds(200, 400, 200, 200);
		six.addActionListener(e -> {
			markField(sixField, six);
			sixField = true;
			isWinnerX();
			isWinnerO();
		});
		
		seven = new JButton();
		seven.setBounds(400, 0, 200, 200);
		seven.addActionListener(e -> {
			markField(sevenField, seven);
			sevenField = true;
			isWinnerX();
			isWinnerO();
		});
		
		eight = new JButton();
		eight.setBounds(400, 200, 200, 200);
		eight.addActionListener(e -> {
			markField(eightField, eight);
			eightField = true;
			isWinnerX();
			isWinnerO();
		});
		
		nine = new JButton();
		nine.setBounds(400, 400, 200, 200);
		nine.addActionListener(e -> {
			markField(nineField, nine);
			nineField = true;
			isWinnerX();
			isWinnerO();
		});

		buttonList.add(one);
		buttonList.add(two);
		buttonList.add(three);
		buttonList.add(four);
		buttonList.add(five);
		buttonList.add(six);
		buttonList.add(seven);
		buttonList.add(eight);
		buttonList.add(nine);

		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
	}
}

