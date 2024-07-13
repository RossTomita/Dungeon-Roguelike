package SpriteFactory;

import javax.swing.*;

public class SpriteFactory {

    //TODO: add bounds checks
    public JLabel getSprite(String spriteType, int x, int y) {
        if (spriteType == null) {
            return null;
        }
        if (spriteType.equalsIgnoreCase("Player")) {
            return new PlayerSprite().draw(x, y);
        }
        return null;
    }


}
