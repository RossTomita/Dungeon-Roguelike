// Contains Array of Entities to be updated

// Subject - Array of Entities


import Observer.MouseObserver;

import java.util.ArrayList;

public class Model implements MouseObserver {
    int xBound;
    int yBound;



    public void setModelBounds(int x, int y) {
        xBound = x;
        yBound = y;
    }


    // Purpose: Update the state of the game based on current variables
    public void update(ArrayList<GameObject> gameObjects) {
        for (GameObject o : gameObjects) {
            o.getEntity().update_Pos();
            keepInBounds(o.getEntity());

        }

        // if event queue is nonempty, add items to gameObjects

    }






    // Requires: Bounds have been set already
    // Purpose: wipe the entity list and initialize player start location
    public void ResetVariables() {
        //

    }


    // Purpose: Check if GameObject is in bounds, if not set bound so it is
    // TODO: reset the entity bounds to bound - spriteSize
    void keepInBounds(Entity e) {

        if (e.getPosX() >= xBound) {
            e.setPosX(xBound - 10);
        };
        if (e.getPosY() >= yBound) {
            e.setPosY(yBound - 10);
        }
        if (e.getPosX() <= 0) {
            e.setPosX(10);
        };
        if (e.getPosY() <= 0) {
            e.setPosY(10);
        }
    }










    // Purpose: Check if entity is out of bounds or collided with other entity
    public void checkCollisions() {

    }


    @Override
    public void updateMouseEvent(String me) {


        // create entity



        // create sprite


        //GameState.getInstance().addGameObject( );



    }
}
