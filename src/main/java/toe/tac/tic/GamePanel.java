package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel { // GamePanel skleja wszystkie panele do jednego

    BoardPanel boardPanel = new BoardPanel();

    GamePanel() {
        setLayout(new BorderLayout());

        add(boardPanel.playerPanel, BorderLayout.PAGE_START);
        add(boardPanel, BorderLayout.CENTER);
        add(boardPanel.roundPanel, BorderLayout.PAGE_END);
    }

    public BoardPanel getBoardPanel() {return boardPanel;}
    public void setBoardPanel(BoardPanel boardPanel) {this.boardPanel = boardPanel;}
}
