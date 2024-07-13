import java.util.ArrayList;

public class Game {

    // Utility Classes
    KeyUserInputThread userInputThread;
    View view;
    Model model;


    // Purpose: sets up a new game, creates and instantiates new classes
    public void newGame() {
        // Use Singleton
        GameState gamestate = GameState.getInstance();
        int WIDTH = gamestate.WIDTH;
        int HEIGHT = gamestate.HEIGHT;


        // setup KeyUserInputThread
        userInputThread = new KeyUserInputThread();

        // setup View
        view = new View();
        view.newGameScreen(WIDTH, HEIGHT);

        // setup Model
        model = new Model();
        model.setModelBounds(WIDTH, HEIGHT);
        model.ResetVariables();


        // Create the User-Controlled Player and add to game Objects
        Player player = new Player(WIDTH / 2, HEIGHT / 2);
        gamestate.setPlayer(player);

        userInputThread.addObserver(player);

        GameObject playerObject = new GameObject();
        playerObject.setEntity(player);
        playerObject.setSprite(view.generatePlayer(WIDTH / 2, HEIGHT / 2));


        gamestate.addGameObject(playerObject);


        // Start the game (user can now interact)
        userInputThread.GameUserInputThread();
        GameLoop();

        System.out.println("Game terminated successfully");

    }


    // TODO: add termination condition while(notDead)
    // Purpose: Run the game
    public void GameLoop() {

        // Fix so no infinite loop
        while (true) {

            ArrayList<GameObject> gameObjects = GameState.getInstance().getGameObjects();

            model.update(gameObjects);

            view.render(gameObjects);


            // Sleep to ensure program doesn't run too fast
            try {
                Thread.sleep(50); // Sleep for 3000 milliseconds (3 seconds)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


//            // FOR TESTING ONLY:
//            for (GameObject o : gameObjects) {
//                System.out.println("VISUAL X:");
//                System.out.println(o.getSprite().getX());
//
//                System.out.println("MODEL X:");
//                System.out.println(o.getEntity().getPosX());
//            }

        }


    }
}
