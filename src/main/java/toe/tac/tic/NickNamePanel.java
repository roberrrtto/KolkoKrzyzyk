package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static toe.tac.tic.Main.gameFrame;
import static toe.tac.tic.Main.nickNameFrame;

public class NickNamePanel extends JPanel {

    BufferedImage img;
    private JLabel nickName;
    static JButton playGame;
    private JTextField xNickName, oNickName;
    ImageIcon icon = new ImageIcon("src/playButton.png");

    public NickNamePanel() {
        setLayout(null);

        try {
            img = ImageIO.read(new File(
                    "src/swords.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        playGame = new JButton();
        playGame.setIcon(icon);
        playGame.setBounds(236,45,icon.getIconWidth(),icon.getIconHeight());
        playGame.addActionListener(e -> {
            gameFrame.setVisible(true);
            nickNameFrame.setVisible(false);
        });

        nickName = new JLabel("<< ENTER YOUR NICKNAMES >>");
        nickName.setBounds(195,5,240,45);

        xNickName = new JTextField("    PLAYER X", SwingConstants.CENTER);
        xNickName.setBounds(90,50,110,45);


        oNickName = new JTextField("    PLAYER O", SwingConstants.CENTER);
        oNickName.setBounds(400,50,110,45);


        add(oNickName);
        add(xNickName);
        add(nickName);
        add(playGame);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paint the background image and scale it to fill the entire space
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
