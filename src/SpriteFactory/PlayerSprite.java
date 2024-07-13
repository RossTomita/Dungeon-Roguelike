package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class PlayerSprite implements Sprite {


    // Player Sprite Representation
    @Override
    public JLabel draw(int x, int y) {

        JLabel player = new JLabel("-[]-");
        player.setBounds(x, y, 20, 20); // (x, y, width, height)
        // Set the foreground color of the JLabel to red
        player.setForeground(Color.RED);

        return player;


    }
}
