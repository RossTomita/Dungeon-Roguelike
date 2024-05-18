// Contains Array of Entities to be updated

// Subject - Array of Entities


import java.util.ArrayList;

public class Model implements Observer {
    int xBound;
    int yBound;
    ArrayList<Entity> entities = new ArrayList<>();


    // Getters and setters
    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setBounds(int x, int y) {
        xBound = x;
        yBound = y;
    }


    // Note: have Key Event user input variable
    @Override
    public void processKeyEvent(String ke) {

        // Simulate one round
        for (Entity e : entities) {
            e.update_KE(ke);
        }

        // add missiles?

    }


    public void update() {
        for (Entity e : entities) {
            e.update_Pos();
        }
    }

    // Requires: Bounds have been set already
    // Purpose: wipe the entity list and initialize player start location
    public void ResetVariables() {
        entities.clear();

        // initialize Player
        Player player = new Player(xBound / 2, yBound / 2);
        entities.add(player);

    }















    // Purpose: Check if entity is out of bounds or collided with other entity
    public void checkCollisions() {

    }




}
