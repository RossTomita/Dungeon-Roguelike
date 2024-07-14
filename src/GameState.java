import java.util.ArrayList;

public class GameState {
    // private static instance of class
    private static GameState instance;
    ArrayList<GameObject> gameObjects = new ArrayList<>();
    ArrayList<GameObject> unrendered = new ArrayList<>();
    int HEIGHT = 500;
    int WIDTH = 500;
    Player player;

    public ArrayList<GameObject> getUnrendered() {
        return unrendered;
    }

    public void setUnrendered(ArrayList<GameObject> unrendered) {
        this.unrendered = unrendered;
    }

    // Make constructor private to prevent instantiation
    private GameState() {
        //
    }


    // public method to get singleton
    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }


    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(ArrayList<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }


    public void addGameObject(GameObject o) {
        gameObjects.add(o);
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
