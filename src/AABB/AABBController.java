package AABB;

import GameObjects.GameState;
import Model.GameObject;

import java.util.ArrayList;

public class AABBController {


    Component tree;
    ArrayList<GameObject> gameObjects;


    //TODO
    // PURPOSE: Constructs a new AABB tree
    void updateTree() {

        gameObjects = GameState.getInstance().getGameObjects();




        if (tree == null) {

        }








    }


















    //TODO
    // PURPOSE: Queries the AABB tree, finds and resolves collisions
    void checkCollisions() {

    }


    //TODO
    // PURPOSE: resolves the collisions given
    void resolveCollisions() {

    }


    //TODO
    // PURPOSE: given two overlapping entities, resolves the collision
    void resolveSingleCollision() {

    }




}
