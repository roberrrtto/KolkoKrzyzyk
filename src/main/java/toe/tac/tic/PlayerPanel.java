package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    BorderLayout borderLayout = new BorderLayout();

    PlayerPanel() {

        setLayout(borderLayout);
        borderLayout.setHgap(140);
//        setBorder(BorderFactory.createEmptyBorder());


        JLabel player1 = new JLabel("Player 'X'");
        JLabel result = new JLabel("Result: 2 - 1");
        JLabel player2 = new JLabel("Player 'O'");

        add(player1, BorderLayout.LINE_START);
        add(result, BorderLayout.CENTER);
        add(player2, BorderLayout.LINE_END);
    }
}
