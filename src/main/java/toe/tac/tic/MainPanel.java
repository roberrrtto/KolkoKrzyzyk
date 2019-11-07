package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    //    JSplitPane playerPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    RoundPanel roundPanel = new RoundPanel();
    JPanel middlePanel = new JPanel();
    PlayerPanel playerPanel = new PlayerPanel();



    MainPanel() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder());

//        playerPanel.setLeftComponent(player1);



        add(playerPanel, BorderLayout.PAGE_START);
        add(roundPanel, BorderLayout.PAGE_END);
        add(middlePanel);
    }
}
