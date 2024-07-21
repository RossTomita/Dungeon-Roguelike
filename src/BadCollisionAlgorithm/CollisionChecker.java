package BadCollisionAlgorithm;

import java.util.ArrayList;

import GameObjects.Entity;
import Model.GameObject;


// UNOPTIMIZED O(n^2) placeholder
public class CollisionChecker {



    public static void checkCollisions(ArrayList<GameObject> gameObjects) {

        for (int i = 1; i < gameObjects.size(); i++) {

            Entity entity = gameObjects.get(i).getEntity();


            for (int j = 0; j < gameObjects.size(); j++) {


            }
        }



    }














}

