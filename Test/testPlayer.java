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
        entity.posX = 5;
        entity.posY = 10;
        entity.dx = 2;
        entity.dy = 3;
        entity.update_Pos();

        assertEquals(7, entity.posX);
        assertEquals(13, entity.posY);
    }

    @Test
    void testUpdatePos_WithNegativeValues() {
        entity.posX = 5;
        entity.posY = 10;
        entity.dx = -2;
        entity.dy = -3;
        entity.update_Pos();

        assertEquals(3, entity.posX);
        assertEquals(7, entity.posY);
    }

    @Test
    void testUpdatePos_WithZeroValues() {
        entity.posX = 5;
        entity.posY = 10;
        entity.dx = 0;
        entity.dy = 0;
        entity.update_Pos();

        assertEquals(5, entity.posX);
        assertEquals(10, entity.posY);
    }

    @Test
    void testUpdatePos_WithMixedValues() {
        entity.posX = 5;
        entity.posY = 10;
        entity.dx = 2;
        entity.dy = -3;
        entity.update_Pos();

        assertEquals(7, entity.posX);
        assertEquals(7, entity.posY);
    }



}












