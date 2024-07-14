package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class ProjectileSprite implements Sprite {



    // Player Sprite Representation
    @Override
    public JLabel draw(int x, int y) {

        JLabel projectile = new JLabel(".");
        projectile.setBounds(x, y, 10, 10); // (x, y, width, height)
        // Set the foreground color of the JLabel to red
        projectile.setForeground(Color.RED);

        return projectile;


    }


}
