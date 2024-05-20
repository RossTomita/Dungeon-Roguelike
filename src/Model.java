// Contains Array of Entities to be updated

// Subject - Array of Entities


import java.util.ArrayList;

public class Model {
    int xBound;
    int yBound;


    // Getters and setters

    public void setModelBounds(int x, int y) {
        xBound = x;
        yBound = y;
    }



    // Purpose: Update the state of the game based on current variables
    public void update(ArrayList<GameObject> gameObjects) {

        for (GameObject o : gameObjects) {
            o.getEntity().update_Pos();
        }
    }



    // Requires: Bounds have been set already
    // Purpose: wipe the entity list and initialize player start location
    public void ResetVariables() {
        //

    }








    // Purpose: Check if entity is out of bounds or collided with other entity
    public void checkCollisions() {

    }




}
