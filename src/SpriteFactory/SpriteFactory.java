package SpriteFactory;

import javax.swing.*;

public class SpriteFactory {

    //TODO: add bounds checks
    public static JLabel getSprite(String spriteType, int x, int y) {
        if (spriteType == null) {
            return null;
        }
        if (spriteType.equalsIgnoreCase("Player")) {
            return new PlayerSprite().draw(x, y);
        }
        else if  (spriteType.equalsIgnoreCase("Projectile")) {
            return new ProjectileSprite().draw(x, y);
        }
        return null;
    }


}
