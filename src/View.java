import javax.swing.*;


// Observer - Observer to Model (updates Entities)


public class View {
    GameWindow Screen;



    // Purpose: Create a new blank screen (erasing previous one)
    void NewGameScreen() {
        Screen = new GameWindow();
    }



    // Modifies: GameWindow screen field
    // Purpose: Generate next frame based on updated state of Model
    void renderNextFrame() {

    }



}
