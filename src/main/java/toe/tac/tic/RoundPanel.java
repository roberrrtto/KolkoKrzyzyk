package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class RoundPanel extends JPanel {

    JLabel round;
    int roundNo = 3;
//    BoxLayout boxLayout = new BoxLayout(new RoundPanel(), BoxLayout.LINE_AXIS);

    RoundPanel() {
        round = new JLabel("Round: " + roundNo, SwingConstants.CENTER);
        round.setPreferredSize(new Dimension(200,50));
        round.setFont(round.getFont().deriveFont(17f));
        round.setOpaque(true);
        round.setBackground(Color.LIGHT_GRAY);


        add(round);
    }
}
