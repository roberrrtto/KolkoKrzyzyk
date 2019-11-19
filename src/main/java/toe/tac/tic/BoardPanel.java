package toe.tac.tic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static toe.tac.tic.Main.*;

public class BoardPanel extends JPanel {

	ImageIcon iconX = new ImageIcon("src/krzyzyk-Ver2 copy.png");
	ImageIcon iconWinnerX = new ImageIcon("src/krzyzyk-Winner-Ver2 copy.png");
	ImageIcon iconO = new ImageIcon("src/kolko-Ver2 copy.png");
	ImageIcon iconWinnerO = new ImageIcon("src/kolko-Winner-Ver2 copy.png");
	ImageIcon iconH = new ImageIcon("src/kreska-pionowa-Ver2 copy 3.png");
	ImageIcon iconV = new ImageIcon("src/kreska-pionowa-Ver2 copy.png");
	ImageIcon iconBackground = new ImageIcon("src/tlo-jasne.png");

	int test = 0;
	int test2 = 0;
	PlayerPanel playerPanel = new PlayerPanel();
	RoundPanel roundPanel = new RoundPanel();
	WinPanel winPanel = new WinPanel();

	JLabel horizontalLine1, horizontalLine2, verticalLine1, verticalLine2;
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
			jb.setIcon(iconBackground);
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
				buttonName.setIcon(iconX);
				x = false;
			} else {
				buttonName.setIcon(iconO);
				x = true;
			}
		}
	}

	private void isDraw() {
		if (oneField && twoField &&	threeField
			&& fourField && fiveField && sixField
			&& sevenField && eightField && nineField) {
			roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
		}
	}

	public void isWinnerX() { // sprawdzenie czy X wygrywa rundę
		try {
			if (one.getIcon().equals(iconX) && two.getIcon().equals(iconX) && three.getIcon().equals(iconX)) {
				winnerX = true;
				one.setIcon(iconWinnerX);
				two.setIcon(iconWinnerX);
				three.setIcon(iconWinnerX);
			} else if (four.getIcon().equals(iconX) && five.getIcon().equals(iconX) && six.getIcon().equals(iconX)) {
				winnerX = true;
				four.setIcon(iconWinnerX);
				five.setIcon(iconWinnerX);
				six.setIcon(iconWinnerX);
			} else if (seven.getIcon().equals(iconX) && eight.getIcon().equals(iconX) && nine.getIcon().equals(iconX)) {
				winnerX = true;
				seven.setIcon(iconWinnerX);
				eight.setIcon(iconWinnerX);
				nine.setIcon(iconWinnerX);
			} else if (one.getIcon().equals(iconX) && four.getIcon().equals(iconX) && seven.getIcon().equals(iconX)) {
				winnerX = true;
				one.setIcon(iconWinnerX);
				four.setIcon(iconWinnerX);
				seven.setIcon(iconWinnerX);
			} else if (two.getIcon().equals(iconX) && five.getIcon().equals(iconX) && eight.getIcon().equals(iconX)) {
				winnerX = true;
				two.setIcon(iconWinnerX);
				five.setIcon(iconWinnerX);
				eight.setIcon(iconWinnerX);
			} else if (three.getIcon().equals(iconX) && six.getIcon().equals(iconX) && nine.getIcon().equals(iconX)) {
				winnerX = true;
				three.setIcon(iconWinnerX);
				six.setIcon(iconWinnerX);
				nine.setIcon(iconWinnerX);
			} else if (one.getIcon().equals(iconX) && five.getIcon().equals(iconX) && nine.getIcon().equals(iconX)) {
				winnerX = true;
				one.setIcon(iconWinnerX);
				five.setIcon(iconWinnerX);
				nine.setIcon(iconWinnerX);
			} else if (seven.getIcon().equals(iconX) && five.getIcon().equals(iconX) && three.getIcon().equals(iconX)) {
				winnerX = true;
				seven.setIcon(iconWinnerX);
				five.setIcon(iconWinnerX);
				three.setIcon(iconWinnerX);
			}
			if (winnerX) {
				roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
				playerPanel.setScoreX(playerPanel.getScoreX() + 1); // dodanie +1 do wyniku X
				playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie nowego wyniku
				blockTheBoard();
			}
			if (playerPanel.getScoreX() == 3) {
				WinPanel.winMessage.setText("The winner is Player X!"); // sprawdzenie czy osiągnięto wynik 3, jesli tak to info o wygranej
				startJFrame.setVisible(false);
				gameFrame.setVisible(false);
				winFrame.setVisible(true);
				clearAllFields();
			}
		} catch (NullPointerException e) {
			e.getMessage();
		}
	}

	public void isWinnerO() { // sprawdzenie czy O wygrywa rundę
		if (one.getIcon().equals(iconO) && two.getIcon().equals(iconO) && three.getIcon().equals(iconO)) {
			winnerO = true;
			one.setIcon(iconWinnerO);
			two.setIcon(iconWinnerO);
			three.setIcon(iconWinnerO);
		} else if (four.getIcon().equals(iconO) && five.getIcon().equals(iconO) && six.getIcon().equals(iconO)) {
			winnerO = true;
			four.setIcon(iconWinnerO);
			five.setIcon(iconWinnerO);
			six.setIcon(iconWinnerO);
		} else if (seven.getIcon().equals(iconO) && eight.getIcon().equals(iconO) && nine.getIcon().equals(iconO)) {
			winnerO = true;
			seven.setIcon(iconWinnerO);
			eight.setIcon(iconWinnerO);
			nine.setIcon(iconWinnerO);
		} else if (one.getIcon().equals(iconO) && four.getIcon().equals(iconO) && seven.getIcon().equals(iconO)) {
			winnerO = true;
			one.setIcon(iconWinnerO);
			four.setIcon(iconWinnerO);
			seven.setIcon(iconWinnerO);
		} else if (two.getIcon().equals(iconO) && five.getIcon().equals(iconO) && eight.getIcon().equals(iconO)) {
			winnerO = true;
			two.setIcon(iconWinnerO);
			five.setIcon(iconWinnerO);
			eight.setIcon(iconWinnerO);
		} else if (three.getIcon().equals(iconO) && six.getIcon().equals(iconO) && nine.getIcon().equals(iconO)) {
			winnerO = true;
			three.setIcon(iconWinnerO);
			six.setIcon(iconWinnerO);
			nine.setIcon(iconWinnerO);
		} else if (one.getIcon().equals(iconO) && five.getIcon().equals(iconO) && nine.getIcon().equals(iconO)) {
			winnerO = true;
			one.setIcon(iconWinnerO);
			five.setIcon(iconWinnerO);
			nine.setIcon(iconWinnerO);
		} else if (seven.getIcon().equals(iconO) && five.getIcon().equals(iconO) && three.getIcon().equals(iconO)) {
			winnerO = true;
			seven.setIcon(iconWinnerO);
			five.setIcon(iconWinnerO);
			three.setIcon(iconWinnerO);
		}
		if (winnerO) {
			roundPanel.setNextRoundButtonVisible(true); // odkrycie przycisku Next round
			playerPanel.setScoreO(playerPanel.getScoreO() + 1); // dodanie +1 do wyniku O
			playerPanel.scoreDisplay.setText("Score: " + playerPanel.getScoreX() + "-" + playerPanel.getScoreO()); // wypisanie nowego wyniku
			blockTheBoard();
		}
		if (playerPanel.getScoreO() == 3) { // sprawdzenie czy osiągnięto wynik 3, jeśli tak to info o wygranej
			WinPanel.winMessage.setText("The winner is Player O!");
			startJFrame.setVisible(false);
			gameFrame.setVisible(false);
			winFrame.setVisible(true);
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

		verticalLine1 = new JLabel(iconV);
		verticalLine1.setBounds(200,0,10,620);
		verticalLine2 = new JLabel(iconV);
		verticalLine2.setBounds(410,0,10,620);
		horizontalLine1 = new JLabel(iconH);
		horizontalLine1.setBounds(0,200,620,10);
		horizontalLine2 = new JLabel(iconH);
		horizontalLine2.setBounds(0,410,620,10);

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
		two.setBounds(0, 210, 200, 200);
		two.setOpaque(true);
		two.addActionListener(e -> {
			markField(twoField, two);
			if (!twoField) {
				twoField = true;
				isWinner();
			}
		});


		three = new JButton();
		three.setBounds(0, 420, 200, 200);
		three.setOpaque(true);
		three.addActionListener(e -> {
			markField(threeField, three);
			if (!threeField) {
				threeField = true;
				isWinner();
			}
		});



		four = new JButton();
		four.setBounds(210, 0, 200, 200);
		four.addActionListener(e -> {
			markField(fourField, four);
			if (!fourField) {
				fourField = true;
				isWinner();
			}
		});

		five = new JButton();
		five.setBounds(210, 210, 200, 200);
		five.addActionListener(e -> {
			markField(fiveField, five);
			if (!fiveField) {
				fiveField = true;
				isWinner();
			}
		});

		six = new JButton();
		six.setBounds(210, 420, 200, 200);
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
		seven.setBounds(420, 0, 200, 200);
		seven.addActionListener(e -> {
			markField(sevenField, seven);
			if (!sevenField) {
				sevenField = true;
				isWinner();
			}
		});

		eight = new JButton();
		eight.setBounds(420, 210, 200, 200);
		eight.addActionListener(e -> {
			markField(eightField, eight);
			if (!eightField) {
				eightField = true;
				isWinner();
			}
		});

		nine = new JButton();
		nine.setBounds(420, 420, 200, 200);
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

		for (JButton jb : buttonList) {
			jb.setIcon(iconBackground);
		}
		add(horizontalLine1);
		add(horizontalLine2);
		add(verticalLine1);
		add(verticalLine2);
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
