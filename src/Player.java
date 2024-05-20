

public class Player extends Entity implements Observer {

    // TODO: abstract the speed variable
    int SPEED = 5;

    public Player(int x, int y) {
        posX = x;
        posY = y;

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
