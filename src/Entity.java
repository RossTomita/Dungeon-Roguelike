

public class Entity {
    // Game Window Constraints
    static int width;
    static int height;
    boolean isRendered = false;
    String type;


    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Entity.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Entity.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRendered() {
        return isRendered;
    }

    public void setRendered(boolean rendered) {
        isRendered = rendered;
    }

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

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
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
