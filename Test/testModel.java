import GameState.Player;
import GameState.Entity;
import Model.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Model.GameObject;

import static org.junit.Assert.assertEquals;

class testModel {
    private GameObject gameObject;
    private final int xBound = 800;
    private final int yBound = 600;
    private Model model;
    private int width = 10;
    private int height = 10;


    @BeforeEach
    void setUp() {
        Entity entity = new Player(xBound, yBound);
        entity.setWidth(width);
        entity.setHeight(height);
        gameObject = new GameObject();
        gameObject.setEntity(entity);
        model = new Model();
        model.setModelBounds(xBound, yBound);
    }


    // RIGHT
    @Test
    void testKeepInBounds_PosXOutOfBoundRight() {
        // Out of xBound to the right
        gameObject.getEntity().setPosX(xBound - (gameObject.getEntity().getWidth() / 2)  + 1);
        model.keepInBounds(gameObject);
        assertEquals(xBound - (gameObject.getEntity().getWidth() / 2), gameObject.getEntity().getPosX());
    }

    @Test
    void testKeepInBounds_PosXInBoundRight() {
        // In xBound to the right
        gameObject.getEntity().setPosX(xBound - (gameObject.getEntity().getWidth() / 2)  - 1);
        model.keepInBounds(gameObject);
        assertEquals(xBound - (gameObject.getEntity().getWidth() / 2) - 1, gameObject.getEntity().getPosX());
    }

    @Test
    void testKeepInBounds_PosXExactlyInBoundRight() {
        // on xBound to the right
        gameObject.getEntity().setPosX(xBound - (gameObject.getEntity().getWidth() / 2));
        model.keepInBounds(gameObject);
        assertEquals(xBound - gameObject.getEntity().getWidth() / 2, gameObject.getEntity().getPosX());
    }

    // BOTTOM
    @Test
    void testKeepInBounds_PosYOutOfBoundBottom() {
        // Out of yBound to the bottom
        gameObject.getEntity().setPosY(yBound - (gameObject.getEntity().getHeight() / 2)  + 1);
        model.keepInBounds(gameObject);
        assertEquals(yBound - gameObject.getEntity().getHeight() / 2, gameObject.getEntity().getPosY());
    }

    @Test
    void testKeepInBounds_PosYInBoundBottom() {
        // In yBound to the bottom
        gameObject.getEntity().setPosY(yBound - (gameObject.getEntity().getHeight() / 2)  - 1);
        model.keepInBounds(gameObject);
        assertEquals(yBound - (gameObject.getEntity().getHeight() / 2) - 1, gameObject.getEntity().getPosY());
    }

    @Test
    void testKeepInBounds_PosYExactlyInBoundBottom() {
        // On yBound to the bottom
        gameObject.getEntity().setPosY(yBound - (Entity.getHeight() / 2));
        model.keepInBounds(gameObject);
        assertEquals(yBound - gameObject.getEntity().getHeight() / 2, gameObject.getEntity().getPosY());
    }

    // LEFT
    @Test
    void testKeepInBounds_PosXOutOfBoundLeft() {
        gameObject.getEntity().setPosX((gameObject.getEntity().getWidth() / 2) - 1); // Out of xBound to the left
        model.keepInBounds(gameObject);
        assertEquals(gameObject.getEntity().getWidth() / 2, gameObject.getEntity().getPosX());
    }

    @Test
    void testKeepInBounds_PosXInBoundLeft() {
        gameObject.getEntity().setPosX((gameObject.getEntity().getWidth() / 2) + 1); // In xBound to the left
        model.keepInBounds(gameObject);
        assertEquals((gameObject.getEntity().getWidth() / 2) + 1, gameObject.getEntity().getPosX());
    }

    @Test
    void testKeepInBounds_PosXExactlyInBoundLeft() {
        gameObject.getEntity().setPosX((gameObject.getEntity().getWidth() / 2)); // On xBound to the left
        model.keepInBounds(gameObject);
        assertEquals(gameObject.getEntity().getWidth() / 2, gameObject.getEntity().getPosX());
    }


    // TOP
    @Test
    void testKeepInBounds_PosYOutOfBoundTop() {
        gameObject.getEntity().setPosY((gameObject.getEntity().getHeight() / 2) - 1); // Out of yBound to the top
        model.keepInBounds(gameObject);
        assertEquals(gameObject.getEntity().getHeight() / 2, gameObject.getEntity().getPosY());
    }

    @Test
    void testKeepInBounds_PosYInBoundTop() {
        gameObject.getEntity().setPosY((gameObject.getEntity().getHeight() / 2) + 1); // In yBound to the top
        model.keepInBounds(gameObject);
        assertEquals((gameObject.getEntity().getHeight() / 2) + 1, gameObject.getEntity().getPosY());
    }

    @Test
    void testKeepInBounds_PosYExactlyInBoundTop() {
        gameObject.getEntity().setPosY((gameObject.getEntity().getHeight() / 2)); // On yBound to the top
        model.keepInBounds(gameObject);
        assertEquals(gameObject.getEntity().getHeight() / 2, gameObject.getEntity().getPosY());
    }


    // Add more tests if necessary
}