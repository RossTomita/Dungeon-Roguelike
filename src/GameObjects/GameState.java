package GameObjects;

import java.util.ArrayList;

public class GameState {
    // private static instance of class
    private static GameState instance;
    ArrayList<Model.GameObject> gameObjects = new ArrayList<>();
    ArrayList<Model.GameObject> unrendered = new ArrayList<>();
    int HEIGHT = 1000;
    int WIDTH = 1000;
    Player player;

    public ArrayList<Model.GameObject> getUnrendered() {
        return unrendered;
    }

    public void setUnrendered(ArrayList<Model.GameObject> unrendered) {
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


    public ArrayList<Model.GameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(ArrayList<Model.GameObject> gameObjects) {
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


    public void addGameObject(Model.GameObject o) {
        gameObjects.add(o);
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
