package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class SpriteFactory {

    //TODO: add bounds checks
    public static void drawSprite(String spriteType, int x, int y, Graphics g) {
        if (spriteType == null) {
            // do nothing
        }
        if (spriteType.equalsIgnoreCase("Player")) {
            new PlayerSprite().draw(x, y, g);
        }
        else if  (spriteType.equalsIgnoreCase("Projectile")) {
            new ProjectileSprite().draw(x, y, g);
        }
    }


}
