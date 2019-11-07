package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel {

    BorderLayout borderLayout = new BorderLayout();
    JLabel playerX, playerO, score;

    PlayerPanel() {

        setLayout(borderLayout);
//        borderLayout.setHgap(140);
//        setBorder(BorderFactory.createEmptyBorder());
//        setPreferredSize(new Dimension(600,70));
//        setBackground(Color.CYAN);



        playerX = new JLabel("Player 'X'", SwingConstants.CENTER);
//        playerX.setBounds(0,0,125,50);
//        playerX = new JLabel("Player 'X'");
        playerX.setPreferredSize(new Dimension(175,50));
        playerX.setFont(playerX.getFont().deriveFont(17f));
        playerX.setOpaque(true);
        playerX.setBackground(Color.ORANGE);
//        Border border = playerX.getBorder();
//        Border margin = new EmptyBorder(10,10,10,10);
//        playerX.setBorder(new CompoundBorder(border, margin));

        score = new JLabel("Score: 2 - 1", SwingConstants.CENTER);
        score.setPreferredSize(new Dimension(250,50));
        score.setFont(score.getFont().deriveFont(20f));
        score.setOpaque(true);
        score.setBackground(Color.LIGHT_GRAY);
//        Border border1 = score.getBorder();
//        score.setBorder(new CompoundBorder(border, margin));

        playerO = new JLabel("Player 'O'", SwingConstants.CENTER);
        playerO.setPreferredSize(new Dimension(175,50));
        playerO.setFont(playerO.getFont().deriveFont(17f));
        playerO.setOpaque(true);
        playerO.setBackground(Color.ORANGE);
//        Border border2 = playerO.getBorder();
//        playerO.setBorder(new CompoundBorder(border, margin));

        add(playerX, BorderLayout.LINE_START);
        add(score, BorderLayout.CENTER);
        add(playerO, BorderLayout.LINE_END);
    }
}
