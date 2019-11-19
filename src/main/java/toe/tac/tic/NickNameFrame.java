package toe.tac.tic;

import javax.swing.*;
import java.awt.*;

public class NickNameFrame extends JFrame {

    public NickNameFrame() {
        setSize(600, 735);
        setTitle("Nick Names");
        setResizable(false);
        setLocationRelativeTo(null);
        NickNamePanel nickNamePanel = new NickNamePanel();
        nickNamePanel.setBackground(Color.decode("#629ACC"));
        add(nickNamePanel);

    }
}
