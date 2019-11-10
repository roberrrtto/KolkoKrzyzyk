package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    //    JSplitPane playerPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    PlayerPanel playerPanel = new PlayerPanel();
    BoardPanel boardPanel = new BoardPanel();
    RoundPanel roundPanel = new RoundPanel();

///*

// */

    GamePanel() {

        while (!boardPanel.winnerX) {

        setLayout(new BorderLayout());
        setBackground(Color.ORANGE);
//        setBorder(BorderFactory.createEmptyBorder());

        roundPanel.setRoundNo(boardPanel.getRoundNo());


        add(playerPanel, BorderLayout.PAGE_START);
        add(boardPanel, BorderLayout.CENTER);
        add(roundPanel, BorderLayout.PAGE_END);
        }
//        repaint();
        revalidate();
    }
}