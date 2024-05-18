

public class Player extends Entity {

    public Player(int x, int y) {
        posX = x;
        posY = y;
    }


    // TODO;
    // Purpose: Update player DIRECTION
    @Override
    void update_KE(String ke) {

        switch (ke) {
            case "UP":
                System.out.println("UP");

                break;
            case "DOWN":
                System.out.println("DOWN");

                break;
            case "LEFT":
                System.out.println("LEFT");

                break;
            case "RIGHT":
                System.out.println("RIGHT");

                break;
        }



    }






}
