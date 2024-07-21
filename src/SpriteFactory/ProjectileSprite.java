package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class ProjectileSprite implements Sprite {

    // Entity.Player Sprite Representation
    @Override
    public void draw(int x, int y, Graphics g) {

        g.drawRect(x, y, 4, 4);
        g.fillRect(x, y, 4, 4);
        g.setColor(Color.YELLOW);

    }


}
