package toe.tac.tic;

import javax.swing.*;

public class RoundPanel extends JPanel {

    int roundNo = 3;
//    BoxLayout boxLayout = new BoxLayout(new RoundPanel(), BoxLayout.LINE_AXIS);

    RoundPanel() {
//        setLayout(boxLayout);

        JLabel round = new JLabel("Round: " + roundNo);

        add(round);
    }
}
