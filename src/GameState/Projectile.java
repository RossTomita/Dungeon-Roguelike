package GameState;

public class Projectile extends Entity {
    boolean onScreen = false;


    public Projectile(int run, int rise) {
        type = "Entity.Projectile";
        dx = run;
        dy = rise;
    }


    private void setVelocities() {
        //
    }





}
