

public abstract class Entity {
    // Game Window Constraints
    static int WIDTH;
    static int HEIGHT;


    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    protected int dx;
    protected int dy;
    protected int posX;
    protected int posY;




    abstract void processKeyEvent(String ke);



    void update_Pos() {
            posX += dx;
            posY += dy;
    }




}
