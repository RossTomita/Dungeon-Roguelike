// GameLoop
// Handle User Input
// Needs a timer


public class Controller {

    // GAME SIZE VARIABLES:
    int HEIGHT = 500;
    int WIDTH = 500;

    // Utility Classes
    Game g;
    View view;
    Model model;



    // Purpose: sets up a new game, creates and instantiates new classes
    public void NewGame() {


        // Instantiate new classes
        g = new Game();

        view = new View();
        view.newGameScreen(WIDTH, HEIGHT);

        model = new Model();
        model.setBounds(WIDTH, HEIGHT);
        model.ResetVariables();

        g.addObserver(model);



        // Start the game (user can now interact)
        g.GameUserInputThread();
        GameLoop();

        System.out.println("Game terminated successfully");

    }


    // TODO
    // Purpose: Run the game
    public void GameLoop() {


        // Fix so no infinite loop
        while (true) {
            model.update();
        }





    }












    // Requires: MenuWindow has been opened
    // Purpose: Starts thread handling user input for Main Menu
    public void MainMenuThread() {
        //
    }

}
