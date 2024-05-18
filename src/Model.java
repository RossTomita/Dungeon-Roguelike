// Contains Array of Entities to be updated

// Subject - Array of Entities


import java.util.ArrayList;

public class Model implements Observer {

    ArrayList<Entity> entities = new ArrayList<>();
    // State field



    // Note: have Key Event user input variable
    @Override
    public void update() {

        // Simulate one round

        for (Entity e : entities) {
            e.update();
        }
    }



    // Purpose: Check if entity is out of bounds or collided with other entity
    public void checkCollisions() {

    }












}
