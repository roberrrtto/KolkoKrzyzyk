package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class MainKrzysiek {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            GameFrame gameFrame = new GameFrame();
            gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameFrame.setVisible(true);
        });
    }
}
