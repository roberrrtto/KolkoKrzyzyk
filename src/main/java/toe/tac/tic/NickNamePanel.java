package toe.tac.tic;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NickNamePanel extends JPanel {

    BufferedImage img;
    private JLabel xLabel, oLabel;
    private JTextField xNickName, oNickName;

    public NickNamePanel() {
        setLayout(null);

//        ImageIcon icon = new ImageIcon("/Users/kavit/Downloads/tic-tac-toe-2 copy.png");
//        xLabel = new JLabel(icon, SwingConstants.CENTER);
//        xLabel.setBounds(0, 0, 300, 300);
        try {
            img = ImageIO.read(new File(
                    "src/swords.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        xNickName = new JTextField("<<PLAYER X>>");
        xNickName.setBackground(Color.decode("#629ACC"));
        xNickName.setBounds(380,205,110,45);


//        oLabel = new JLabel("", SwingConstants.CENTER);
//        oLabel.setFont(oLabel.getFont().deriveFont(70f));
        oNickName = new JTextField("<<PLAYER O>>");
        oNickName.setBackground(Color.decode("#629ACC"));
        oNickName.setBounds(108,485,110,45);

//        ImageIcon imageIcon = new ImageIcon("/Users/kavit/Desktop/tlo-ciemne.png");

        add(oNickName);
        add(xNickName);
//        add(xLabel);
//        add(oLabel);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paint the background image and scale it to fill the entire space
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
