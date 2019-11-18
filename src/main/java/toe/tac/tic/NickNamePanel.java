package toe.tac.tic;

import javax.swing.*;

public class NickNamePanel extends JPanel {

    private JLabel xLabel, oLabel;
    private JTextField xNickName, oNickName;

    public NickNamePanel() {
        setLayout(null);

        ImageIcon icon = new ImageIcon("/Users/kavit/Downloads/tic-tac-toe (1).png");
        xLabel = new JLabel(icon, SwingConstants.CENTER);
        xLabel.setBounds(200, 150, 200, 100);
        xLabel.setFont(xLabel.getFont().deriveFont(70f));


        oLabel = new JLabel("O", SwingConstants.CENTER);
        oLabel.setBounds(200, 350, 200, 100);
        oLabel.setFont(oLabel.getFont().deriveFont(70f));

        add(xLabel);
        add(oLabel);
    }
}
