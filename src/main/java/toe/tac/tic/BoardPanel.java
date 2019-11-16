package toe.tac.tic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoardPanel extends JPanel {
	
	PlayerPanel playerPanel = new PlayerPanel();
	RoundPanel roundPanel = new RoundPanel();

	JButton one, two, three, four, five, six, seven, eight, nine;
	ArrayList<JButton> buttonList = new ArrayList<>();
	boolean oneField, twoField, threeField, fourField, fiveField, sixField, sevenField, eightField, nineField;
	boolean winnerX, winnerO;
	boolean x = true;

	public void resetAll() { // czyścimy pola przed kolejną rundą
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
			jb.setForeground(Color.BLACK);
		}
	}

	public void markField(boolean fieldName, JButton buttonName) { // Wypisanie X lub O jeśli pole jest wolne
		if (!fieldName) {
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

	public void isWinnerX() { // sprawdzenie czy X wygrywa rundę
		if (one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X")) {
			winnerX = true;
			one.setForeground(Color.RED);
			two.setForeground(Color.RED);
			three.setForeground(Color.RED);
		} else if (four.getText().equals("X") && five.getText().equals("X") && six.getText().equals("X")) {
			winnerX = true;
			four.setForeground(Color.RED);
			five.setForeground(Color.RED);
			six.setForeground(Color.RED);
		} else if (seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
			seven.setForeground(Color.RED);
			eight.setForeground(Color.RED);
			nine.setForeground(Color.RED);
		} else if (one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")) {
			winnerX = true;
			one.setForeground(Color.RED);
			four.setForeground(Color.RED);
			seven.setForeground(Color.RED);
		} else if (two.getText().equals("X") && five.getText().equals("X") && eight.getText().equals("X")) {
			winnerX = true;
			two.setForeground(Color.RED);
			five.setForeground(Color.RED);
			eight.setForeground(Color.RED);
		} else if (three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
			three.setForeground(Color.RED);
			six.setForeground(Color.RED);
			nine.setForeground(Color.RED);
		} else if (one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")) {
			winnerX = true;
			one.setForeground(Color.RED);
			five.setForeground(Color.RED);
			nine.setForeground(Color.RED);
		} else if (seven.getText().equals("X") && five.getText().equals("X") && three.getText().equals("X")) {
			winnerX = true;
			seven.setForeground(Color.RED);
			five.setForeground(Color.RED);
			three.setForeground(Color.RED);
		}
		if (winnerX) {
			roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
			playerPanel.setScoreX(playerPanel.getScoreX() + 1); // dodanie +1 do wyniku X
			playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie
																													// nowego
																													// wyniku
		}
		if (playerPanel.getScoreX() == 3) {
			JOptionPane.showMessageDialog(null, "Baloniki latają, X wygrywa", "X debeściak", 1); // sprawdzenie czy
																									// osiągnięto wynik
																									// 3, jeśli tak to
																									// info o wygranej
		}
	}

	public void isWinnerO() { // sprawdzenie czy O wygrywa rundę
		if (one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O")) {
			winnerO = true;
			one.setForeground(Color.BLUE);
			two.setForeground(Color.BLUE);
			three.setForeground(Color.BLUE);
		} else if (four.getText().equals("O") && five.getText().equals("O") && six.getText().equals("O")) {
			winnerO = true;
			four.setForeground(Color.BLUE);
			five.setForeground(Color.BLUE);
			six.setForeground(Color.BLUE);
		} else if (seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
			seven.setForeground(Color.BLUE);
			eight.setForeground(Color.BLUE);
			nine.setForeground(Color.BLUE);
		} else if (one.getText().equals("O") && four.getText().equals("O") && seven.getText().equals("O")) {
			winnerO = true;
			one.setForeground(Color.BLUE);
			four.setForeground(Color.BLUE);
			seven.setForeground(Color.BLUE);
		} else if (two.getText().equals("O") && five.getText().equals("O") && eight.getText().equals("O")) {
			winnerO = true;
			two.setForeground(Color.BLUE);
			five.setForeground(Color.BLUE);
			eight.setForeground(Color.BLUE);
		} else if (three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
			three.setForeground(Color.BLUE);
			six.setForeground(Color.BLUE);
			nine.setForeground(Color.BLUE);
		} else if (one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")) {
			winnerO = true;
			one.setForeground(Color.BLUE);
			five.setForeground(Color.BLUE);
			nine.setForeground(Color.BLUE);
		} else if (seven.getText().equals("O") && five.getText().equals("O") && three.getText().equals("O")) {
			winnerO = true;
			seven.setForeground(Color.BLUE);
			five.setForeground(Color.BLUE);
			three.setForeground(Color.BLUE);
		}
		if (winnerO) {
			roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
			playerPanel.setScoreO(playerPanel.getScoreO() + 1); // dodanie +1 do wyniku O
			playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie
																													// nowego
																													// wyniku
		}
		if (playerPanel.getScoreO() == 3) { // sprawdzenie czy osiągnięto wynik 3, jeśli tak to info o wygranej
			JOptionPane.showMessageDialog(null, "Baloniki latają, O wygrywa", "O debeściako", 1);
		}
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
//			resetAll();

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

		// wypełnienie ArrayList<JButton> buttonList
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

		// dodanie akcji dla przycisku Next Round
		roundPanel.nextRoundButton.addActionListener(e -> {
			resetAll();
			roundPanel.setRoundCounter(roundPanel.getRoundCounter() + 1); // dodanie +1 do liczby rund
			roundPanel.roundDisplay.setText("Round: " + roundPanel.getRoundCounter()); // wypisanie kolejnej rundy
			roundPanel.setNextRoundButtonVisible(false); // ukrycie przycisku Next round
		});

	}
}

// Notki Krzyśka. Wyczyścimy przy ostatecznej wersji.

//		try {
//			TimeUnit.SECONDS.sleep(1);
//		} catch (InterruptedException k) {
//			k.printStackTrace();
//		}

//	boolean oneFieldX = false;
//	boolean oneFieldO = false;
//	boolean twoFieldX = false;
//	boolean twoFieldO = false;
//	boolean threeFieldX = false;
//	boolean threeFieldO = false;
//	boolean fourFieldX = false;
//	boolean fourFieldO = false;
//	boolean fiveFieldX = false;
//	boolean fiveFieldO = false;
//	boolean sixFieldX = false;
//	boolean sixFieldO = false;
//	boolean sevenFieldX = false;
//	boolean sevenFieldO = false;
//	boolean eightFieldX = false;
//	boolean eightFieldO = false;
//	boolean nineFieldX = false;
//	boolean nineFieldO = false;

//        fieldList.add(oneField);
//        fieldList.add(twoField);
//        fieldList.add(threeField);
//        fieldList.add(fourField);
//        fieldList.add(fiveField);
//        fieldList.add(sixField);
//        fieldList.add(sevenField);
//        fieldList.add(eightField);
//        fieldList.add(nineField);
