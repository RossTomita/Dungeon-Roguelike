package Model;// Contains Array of Entities to be updated

// Subject - Array of Entities


import GameState.Entity;
import GameState.GameState;
import Observer.MouseObserver;
import GameState.Projectile;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;


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
            keepInBounds(o);


        }

        // if event queue is nonempty, add items to gameObjects

    }


    // Requires: Bounds have been set already
    // Purpose: wipe the entity list and initialize player start location
    public void ResetVariables() {
        //

    }


    // Purpose: Check if Model.Model.GameObject is in bounds, if not set bound so it is
    // Modifies: Entities in Singleton GameObjects list
    public void keepInBounds(GameObject o) {

        if (Objects.equals(o.getEntity().getType(), "Entity.Player")) {

            if (o.getEntity().getPosX() + (o.getEntity().getWidth() / 2) >= xBound) {
                o.getEntity().setPosX(xBound - (o.getEntity().getWidth() / 2));
            }
            if (o.getEntity().getPosY() + (o.getEntity().getHeight() / 2) >= yBound) {
                o.getEntity().setPosY(yBound - o.getEntity().getHeight() / 2);
            }
            if (o.getEntity().getPosX() - (o.getEntity().getWidth() / 2) <= 0) {
                o.getEntity().setPosX(o.getEntity().getWidth() / 2);
            }
            if (o.getEntity().getPosY() - (o.getEntity().getHeight() / 2) <= 0) {
                o.getEntity().setPosY(o.getEntity().getHeight() / 2);
            }

        } else if (Objects.equals(o.getEntity().getType(), "Entity.Projectile")) {
            if (o.getEntity().getPosX() + (o.getEntity().getWidth() / 2) >= xBound) {
                o.getEntity().setDx(-1);
            }
            if (o.getEntity().getPosY() + (o.getEntity().getHeight() / 2) >= yBound) {
                o.getEntity().setDy(-1);
            }
            if (o.getEntity().getPosX() - (o.getEntity().getWidth() / 2) <= 0) {
                o.getEntity().setDx(1);
            }
            if (o.getEntity().getPosY() - (o.getEntity().getHeight() / 2) <= 0) {
                o.getEntity().setDy(1);
            }

        }

    }


    // Purpose: Check if entity is out of bounds or collided with other entity
    public void checkCollisions() {

    }


    @Override
    public void updateMouseEvent(String me, int x, int y) {
        int playerX = GameState.getInstance().getPlayer().getPosX();

        int playerY = GameState.getInstance().getPlayer().getPosY();


        int dx;
        int dy;

        // Basic aiming system
        if (playerX < x) {
            dx = 1;
        } else if (playerX > x) {
            dx = -1;
        } else {
            dx = 0;
        }

        if (playerY < y) {
            dy = 1;
        } else if (playerY > y) {
            dy = -1;
        } else {
            dy = 0;
        }


        Entity projectileEntity = new Projectile(dx, dy);
        projectileEntity.setPosX(GameState.getInstance().getPlayer().getPosX());
        projectileEntity.setPosY(GameState.getInstance().getPlayer().getPosY());

        // create Sprite
        GameObject Projectile = new GameObject();
        Projectile.setEntity(projectileEntity);

        GameState.getInstance().addGameObject(Projectile);

    }

}
