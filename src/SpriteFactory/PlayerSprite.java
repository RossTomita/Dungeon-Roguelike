package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class PlayerSprite implements Sprite {


    // Entity.Player Sprite Representation
    @Override
    public void draw(int x, int y, Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(x, y, 10, 10);
        g.fillOval(x, y, 10, 10);






    }
}
