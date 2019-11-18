package toe.tac.tic;

import javax.swing.*;

public class NickNameFrame extends JFrame {

    public NickNameFrame() {
        setSize(600, 735);
        setTitle("Main Menu");
        setResizable(false);
        setLocationRelativeTo(null);
        NickNamePanel nickNamePanel = new NickNamePanel();
        add(nickNamePanel);

//        Image icon = Toolkit.getDefaultToolkit().getImage("Tic-tac-toe-512.png");
//        setIconImage(icon);
    }
}
