// GameLoop
// Handle User Input
// Needs a timer


import java.util.ArrayList;

public class Controller {

    // GAME SIZE VARIABLES:
    int HEIGHT = 500;
    int WIDTH = 500;

    // Utility Classes
    ArrayList<GameObject> gameObjects;
    Game g;
    View view;
    Model model;



    // getters
    int getHeight() {
        return HEIGHT;
    }

    int getWidth() {
        return WIDTH;
    }

    // Purpose: sets up a new game, creates and instantiates new classes
    public void NewGame() {

        gameObjects = new ArrayList<>();


        // Instantiate new classes
        g = new Game();

        // todo: initialize view to contain WIDTH, HEIGHT fields
        view = new View();
        view.newGameScreen(WIDTH, HEIGHT);

        model = new Model();
        model.setModelBounds(WIDTH, HEIGHT);
        model.ResetVariables();


        // Create the User-Controlled Player and add to game Objects
        Player player = new Player(WIDTH/2, HEIGHT/2);
        g.addObserver(player);

        GameObject playerObject = new GameObject();
        playerObject.setEntity(player);
        playerObject.setSprite(view.generatePlayer(WIDTH/2, HEIGHT/2));

        gameObjects.add(playerObject);




        // Start the game (user can now interact)
        g.GameUserInputThread();
        GameLoop();

        System.out.println("Game terminated successfully");

    }


    // TODO: add termination condition while(notDead)
    // Purpose: Run the game
    public void GameLoop() {

        // Fix so no infinite loop
        while (true) {

            model.update(gameObjects);

            view.render(gameObjects);


            // Sleep to ensure program doesn't run too fast
            try {
                Thread.sleep(200); // Sleep for 3000 milliseconds (3 seconds)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            // FOR TESTING ONLY:
            for (GameObject o : gameObjects) {
                System.out.println("VISUAL X:");
                System.out.println(o.getSprite().getX());

                System.out.println("MODEL X:");
                System.out.println(o.getEntity().getPosX());
            }

        }


    }














    // Requires: MenuWindow has been opened
    // Purpose: Starts thread handling user input for Main Menu
    public void MainMenuThread() {
        //
    }

}
