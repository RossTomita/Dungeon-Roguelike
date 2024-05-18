import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


// Observer - Observer to Model (updates Entities)


public class View {
    GameWindow Screen;





    // Purpose: Create a new blank screen (erasing previous one)
    void newGameScreen(int x, int y) {
        Screen = new GameWindow(x, y);
    }



    // Modifies: GameWindow screen field
    // Purpose: Generate next frame based on updated state of Model
    void render(ArrayList<Entity> entities) {

        // renders all entities
        for (Entity e : entities) {
            drawEntity(e);
        }


    }


    // TODO
    // Purpose: draw a single entity using JLabels
    void drawEntity(Entity e) {
        //


    }





}
