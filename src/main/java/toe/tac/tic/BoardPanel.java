package toe.tac.tic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.startJFrame;


public class BoardPanel extends JPanel {

	ImageIcon icon = new ImageIcon("/Users/kavit/Desktop/krzyzyk copy.png");

	int test = 0;
	int test2 = 0;
	PlayerPanel playerPanel = new PlayerPanel();
	RoundPanel roundPanel = new RoundPanel();

	JButton one, two, three, four, five, six, seven, eight, nine;
	List<JButton> buttonList = new ArrayList<>();
	boolean oneField, twoField, threeField, fourField, fiveField, sixField, sevenField, eightField, nineField;
//	List<Boolean> fieldList = new ArrayList<>();
	boolean winnerX, winnerO;
	boolean x = true;

	public void blockTheBoard() { // blokuje tablice OX
		oneField = true;
		twoField = true;
		threeField = true;
		fourField = true;
		fiveField = true;
		sixField = true;
		sevenField = true;
		eightField = true;
		nineField = true;
	}

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

	public void clearAllFields() { // czyści wszystko po wygranej grze
		resetAll();
		playerPanel.setScoreX(0);
		playerPanel.setScoreO(0);
		roundPanel.setRoundCounter(1);
		roundPanel.setNextRoundButtonVisible(false);
		roundPanel.roundDisplay.setText("Round: " + roundPanel.getRoundCounter());
		playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO());
	}

	public void markField(boolean fieldName, JButton buttonName) { // Wypisanie X lub O jeśli pole jest wolne
		if (!fieldName) {
			if (x) {
//				buttonName.setText("X");
				buttonName.setIcon(icon);
				x = false;
			} else {
				buttonName.setText("O");
				x = true;
			}
		}
		buttonName.setFont(buttonName.getFont().deriveFont(165f));
	}

	private void isDraw() {
		if (oneField && twoField &&	threeField
			&& fourField && fiveField && sixField
			&& sevenField && eightField && nineField) {
			roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
		}
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
			playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie nowego wyniku
			blockTheBoard();
		}
		if (playerPanel.getScoreX() == 3) {
			JOptionPane.showMessageDialog(null, "Baloniki latają, X wygrywa", "X debeściak", 1); // sprawdzenie czy osiągnięto wynik 3, jesli tak to info o wygranej
			startJFrame.setVisible(true);
			gameFrame.setVisible(false);
			clearAllFields();
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
			playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie nowego wyniku
			blockTheBoard();
		}
		if (playerPanel.getScoreO() == 3) { // sprawdzenie czy osiągnięto wynik 3, jeśli tak to info o wygranej
			JOptionPane.showMessageDialog(null, "Baloniki latają, O wygrywa", "O debeściako", 1);
			startJFrame.setVisible(true);
			gameFrame.setVisible(false);
			clearAllFields();
		}
	}

	private void isWinner() {
		isWinnerX();
		isWinnerO();
		isDraw();
	}

	public BoardPanel() {
		setLayout(null);

		one = new JButton();
		one.setBounds(0, 0, 200, 200);
		one.setOpaque(true);
		one.addActionListener(e -> {
			markField(oneField, one);
			if(!oneField) {
				oneField = true;
				isWinner();
			}
		});

		two = new JButton();
		two.setBounds(0, 200, 200, 200);
		two.setOpaque(true);
		two.addActionListener(e -> {
			markField(twoField, two);
			if (!twoField) {
				twoField = true;
				isWinner();
			}
		});


		three = new JButton();
		three.setBounds(0, 400, 200, 200);
		three.setOpaque(true);
		three.addActionListener(e -> {
			markField(threeField, three);
			if (!threeField) {
				threeField = true;
				isWinner();
			}
		});



		four = new JButton();
		four.setBounds(200, 0, 200, 200);
		four.addActionListener(e -> {
			markField(fourField, four);
			if (!fourField) {
				fourField = true;
				isWinner();
			}
		});

		five = new JButton();
		five.setBounds(200, 200, 200, 200);
		five.addActionListener(e -> {
			markField(fiveField, five);
			if (!fiveField) {
				fiveField = true;
				isWinner();
			}
		});

		six = new JButton();
		six.setBounds(200, 400, 200, 200);
		if (!sixField) {
			six.addActionListener(e -> {
				markField(sixField, six);
				if (!sixField) {
					sixField = true;
					isWinner();
				}
			});
		}

		seven = new JButton();
		seven.setBounds(400, 0, 200, 200);
		seven.addActionListener(e -> {
			markField(sevenField, seven);
			if (!sevenField) {
				sevenField = true;
				isWinner();
			}
		});

		eight = new JButton();
		eight.setBounds(400, 200, 200, 200);
		eight.addActionListener(e -> {
			markField(eightField, eight);
			if (!eightField) {
				eightField = true;
				isWinner();
			}
		});

		nine = new JButton();
		nine.setBounds(400, 400, 200, 200);
		nine.addActionListener(e -> {
			markField(nineField, nine);
			if (!nineField) {
				nineField = true;
				isWinner();
			}
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

		// wypełnienie ArrayList<JButton> buttonList
//		fieldList.add(oneField);
//		fieldList.add(twoField);
//		fieldList.add(threeField);
//		fieldList.add(fourField);
//		fieldList.add(fiveField);
//		fieldList.add(sixField);
//		fieldList.add(sevenField);
//		fieldList.add(eightField);
//		fieldList.add(nineField);

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
