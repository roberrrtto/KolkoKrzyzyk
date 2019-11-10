package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class RoundPanel extends JPanel { //RoundPanel wyświetla numer rundy i dodaje przycissk Next round

    JLabel roundDisplay;
    JButton nextRoundButton;
    int roundCounter = 1;

    //metoda do której odwołuje się z poziomu BoardPanel. Służy do chowania/pokazywania przycisku Next round
    public void setNextRoundButtonVisible(boolean b) {
        nextRoundButton.setVisible(b);
    }

    RoundPanel() {
        roundDisplay = new JLabel("Round: " + roundCounter, SwingConstants.CENTER);
        roundDisplay.setPreferredSize(new Dimension(200,50));
        roundDisplay.setFont(roundDisplay.getFont().deriveFont(17f));
        roundDisplay.setOpaque(true);
        roundDisplay.setBackground(Color.LIGHT_GRAY);

        nextRoundButton = new JButton("Next round");
        nextRoundButton.setVisible(false);
        nextRoundButton.setPreferredSize(new Dimension(200,50));

        add(roundDisplay);
        add(nextRoundButton);
    }


    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }
}
