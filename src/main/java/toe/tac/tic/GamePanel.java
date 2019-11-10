package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel { // GamePanel skleja wszystkie panele do jednego

    BoardPanel boardPanel = new BoardPanel();

    GamePanel() {
<<<<<<< HEAD

        

=======
>>>>>>> 9c2fb824dc5fe54721a98926306b17893da94e24
        setLayout(new BorderLayout());

        add(boardPanel.playerPanel, BorderLayout.PAGE_START);
        add(boardPanel, BorderLayout.CENTER);
<<<<<<< HEAD
        add(roundPanel, BorderLayout.PAGE_END);
        
=======
        add(boardPanel.roundPanel, BorderLayout.PAGE_END);
>>>>>>> 9c2fb824dc5fe54721a98926306b17893da94e24
    }
}
