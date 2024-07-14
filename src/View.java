import SpriteFactory.SpriteFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


// Observer - Observer to Model (updates Entities)


public class View {
    GameWindow Screen;
    static ArrayList<GameObject> projectilesToAdd = new ArrayList<>();




    // Purpose: Create a new blank screen (erasing previous one)
    void newGameScreen(int x, int y) {
        Screen = new GameWindow(x, y);
        Screen.setLayout(null);
    }

    void addObserverToGameWindow(Model m) {
        Screen.addObserver(m);
    }





    // Modifies: GameWindow screen field
    // Purpose: Generate next frame based on updated state of Model
    void render(ArrayList<GameObject> gameObjects) {
        // Draws Sprites
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject o = gameObjects.get(i);
            if (!o.getEntity().isRendered()) {
                Screen.add(o.getSprite());
                drawOnScreen(o);
            } else {
                drawOnScreen(o);
            }
        }
    }




    // PURPOSE: update the GameObject's position on the screen
    // Notes: add colours, movement etc...
    void drawOnScreen(GameObject o) {

        float x = o.getEntity().getPosX();
        float y = o.getEntity().getPosY();

        int width = o.getSprite().getWidth();
        int height = o.getSprite().getHeight();

        o.getSprite().setBounds((int) x, (int) y, width, height);

    }


    // PurposeL: Removes all components of the given Container
    private static void removeAllComponents(Container container) {
        container.removeAll(); // Remove all components
        container.revalidate(); // Revalidate the container
        container.repaint();   // Repaint the container
    }


    // MODIFIES: Screen
    // PURPOSE: create a new gameObject and add to Screen
    JLabel generatePlayer(int x, int y) {

        SpriteFactory spriteFactory = new SpriteFactory();
        JLabel playerSprite = spriteFactory.getSprite("Player", x, y);

        Screen.add(playerSprite);

        return playerSprite;

    }

}
