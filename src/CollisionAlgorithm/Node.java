package CollisionAlgorithm;

import GameState.Entity;

public class Node {

        public int key;
        public Entity entity;
        public Node left, right;

        public Node(int coordinate) {
            key = coordinate;
            left = right = null;
        }


}
