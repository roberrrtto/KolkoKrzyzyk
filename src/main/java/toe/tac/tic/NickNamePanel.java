package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.nickNameFrame;

class NickNamePanel extends JPanel {

    private ImageIcon icon = new ImageIcon("src/play.png");
    private BufferedImage img;
    private JLabel nickName;
    private static JButton playGame;
    static JTextField xNickName, oNickName;

    NickNamePanel() {
        setLayout(null);

        try {
            img = ImageIO.read(new File(
                    "src/swords.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        playGame = new JButton();
        playGame.setIcon(icon);
        playGame.setBounds(235,520,icon.getIconWidth(),icon.getIconHeight());
        playGame.setBorder(null);
		playGame.setContentAreaFilled(false);
        playGame.addActionListener(e -> {
            gameFrame.setVisible(true);
            nickNameFrame.setVisible(false);
            gameFrame.getGamePanel().getBoardPanel().getPlayerPanel().getPlayerX().setText(xNickName.getText());
            gameFrame.getGamePanel().getBoardPanel().getPlayerPanel().getPlayerO().setText(oNickName.getText());
        });

        nickName = new JLabel("ENTER YOUR NICKNAMES:");
        nickName.setFont(nickName.getFont().deriveFont(20f));
        nickName.setBounds(170,5,600,45);

        xNickName = new JTextField("PLAYER X");
        xNickName.setHorizontalAlignment(JTextField.CENTER);
        xNickName.setBounds(120,50,110,45);

        oNickName = new JTextField("PLAYER O");
        oNickName.setHorizontalAlignment(JTextField.CENTER);
        oNickName.setBounds(365,50,110,45);

        add(oNickName);
        add(xNickName);
        add(nickName);
        add(playGame);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 75, 80, 450, 450, null);
    }
}
