import javax.swing.*;


// REQUIRES: sprite must be drawn on the Screen on instantiation
public class GameObject {
    boolean rendered = false;
    String type;

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public JLabel getSprite() {
        return sprite;
    }

    public void setSprite(JLabel sprite) {
        this.sprite = sprite;
    }


    Entity entity;
    JLabel sprite;



}
