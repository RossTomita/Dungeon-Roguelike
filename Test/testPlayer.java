import GameObjects.Player;
import GameObjects.Entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPlayer {

    private Entity entity;

    @BeforeEach
    void setUp() {
        entity = new Player(0,0);
    }

    @Test
    void testUpdatePos_WithPositiveValues() {
        entity.setPosX(5);
        entity.setPosY(10);
        entity.setDx(2);
        entity.setDy(3);
        entity.update_Pos();

        assertEquals(7, entity.getPosX());
        assertEquals(13, entity.getPosY());
    }

    @Test
    void testUpdatePos_WithNegativeValues() {
        entity.setPosX(5);
        entity.setPosY(10);
        entity.setDx(-2);
        entity.setDy(-3);
        entity.update_Pos();

        assertEquals(3, entity.getPosX());
        assertEquals(7, entity.getPosY());
    }

    @Test
    void testUpdatePos_WithZeroValues() {
        entity.setPosX(5);
        entity.setPosY(10);
        entity.setDx(0);
        entity.setDy(0);
        entity.update_Pos();

        assertEquals(5, entity.getPosX());
        assertEquals(10, entity.getPosY());
    }

    @Test
    void testUpdatePos_WithMixedValues() {
        entity.setPosX(5);
        entity.setPosY(10);
        entity.setDx(2);
        entity.setDy(-3);
        entity.update_Pos();

        assertEquals(7, entity.getPosX());
        assertEquals(7, entity.getPosY());
    }



}












