

public abstract class Entity {
    // Game Window Constraints
    static int WIDTH;
    static int HEIGHT;


    protected int dx;
    protected int dy;
    protected int posX;
    protected int posY;




    abstract void update_KE(String ke);



    void update_Pos() {
            posX += dx;
            posY += dy;
    }




}
