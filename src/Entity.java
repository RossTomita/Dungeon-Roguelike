

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


    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    protected int dx;
    protected int dy;
    protected int posX;
    protected int posY;


    void update_Pos() {
            posX += dx;
            posY += dy;
    }




}
