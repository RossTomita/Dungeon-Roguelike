package GUI;

import GameObjects.GameState;
import Model.Model;
import Model.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import static SpriteFactory.SpriteFactory.drawSprite;


// Observer - Observer to Model.Model (updates Entities)


public class View {
    GameWindow Screen;
    static ArrayList<GameObject> projectilesToAdd = new ArrayList<>();




    // Purpose: Create a new blank screen (erasing previous one)
    public void newGameScreen(int x, int y) {
        Screen = new GameWindow(x, y);
    }

    // Add Observer to GameWindow field class
    public void addObserverToGameWindow(Model m) {
        Screen.addObserver(m);
    }


    public GameWindow getScreen() {
        return Screen;
    }

    public void setScreen(GameWindow screen) {
        Screen = screen;
    }

    // Modifies: GUI.GameWindow screen field
    // Purpose: Generate next frame based on updated state of Model.Model
    public void render(ArrayList<GameObject> gameObjects) {
        // Draws Sprites
        BufferedImage  bf = new BufferedImage(Screen.getWidth(), Screen.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics g = Screen.getGraphics();

        Screen.paint();

        // Buffered image for smoother animation
        animation(GameState.getInstance().getGameObjects(), bf.getGraphics());
        g.drawImage(bf, 0, 0, null);


    }


    void animation(ArrayList<GameObject> gameObjects, Graphics g) {

        int gameWidth = GameState.getInstance().getHEIGHT();
        int gameHeight = GameState.getInstance().getWIDTH();

        // Draw white box border
        g.drawRect(0, 0, gameWidth, gameHeight);
        g.setColor(Color.WHITE);


        // Draw
        for (int i = 0; i < gameObjects.size(); i++) {
            GameObject o = gameObjects.get(i);
            drawSprite(o.getEntity().getType(), o.getEntity().getPosX(), o.getEntity().getPosY(), g);
        }
    }











    // PurposeL: Removes all components of the given Container
    private static void removeAllComponents(Container container) {
        container.removeAll(); // Remove all components
        container.revalidate(); // Revalidate the container
        container.repaint();   // Repaint the container
    }


    // MODIFIES: Screen
    // PURPOSE: create a new gameObject and add to Screen
    void generatePlayer(int x, int y, Graphics g) {
        drawSprite("Entity.Player", x, y, g);
    }

}
