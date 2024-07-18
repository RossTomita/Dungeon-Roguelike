package GameState;

import Observer.KeyObserver;

public class Player extends Entity implements KeyObserver {

    // TODO: abstract the speed variable
    int SPEED = 2;

    public Player(int x, int y) {
        posX = x;
        posY = y;
        type = "Entity.Player";

        // set starting velocity of player ship



    }

    // Purpose: Process a key event interrupt sent by subject
    // Note: Implementation of Update() in Observer Design pattern
    @Override
    public void processKeyEvent(String ke) {
        switch (ke) {
            case "UP":
                System.out.println("UP");

                dx = 0;
                dy = -SPEED;

                break;
            case "DOWN":
                System.out.println("DOWN");

                dx = 0;
                dy = SPEED;

                break;
            case "LEFT":
                System.out.println("LEFT");

                dx = -SPEED;
                dy = 0;



                break;
            case "RIGHT":
                System.out.println("RIGHT");

                dx = SPEED;
                dy = 0;

                break;
        }



    }



}