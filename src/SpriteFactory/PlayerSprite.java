package SpriteFactory;

import javax.swing.*;
import java.awt.*;

public class PlayerSprite implements Sprite {


    // Entity.Player Sprite Representation
    @Override
    public void draw(int x, int y, Graphics g) {


        // Polygon representation of enemy image

        // x coordinates of vertices
        int xCoords[] = { x-6, x-2,x -2,x+ 2,x+ 2, x+6, x+6, x-6 };

        // y coordinates of vertices
        int yCoords[] = { y-6, y-6, y-12, y-12, y-6, y-6, y+12, y+12 };

        // number of vertices
        int numberofpoints = 8;

        g.setColor(Color.WHITE);
        g.drawPolygon(xCoords, yCoords, numberofpoints);
        g.fillPolygon(xCoords, yCoords, numberofpoints);




//        g.setColor(Color.BLUE);
//        g.drawOval(x, y, 10, 10);
//        g.fillOval(x, y, 10, 10);






    }
}
