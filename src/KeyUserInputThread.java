import Observer.KeySubject;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyUserInputThread extends KeySubject {


    // TODO: add a termination condition for this thread
    // Requires: View has a gameWindow setup
    // Effects: modifies GameWindow in View class
    // Purpose: Starts a thread that handles user input to control PC in a live game
    public void GameUserInputThread() {
        // Create a KeyEventDispatcher to listen for key events
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                // check if the pressed key is the up arrow key


                if (e.getKeyCode() == KeyEvent.VK_UP) {

                    notifyObservers_KE("UP");

                }

                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

                    notifyObservers_KE("DOWN");

                }

                else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                    notifyObservers_KE("LEFT");

                }


                else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                    notifyObservers_KE("RIGHT");


                }


                // return false to allow normal event dispatching to continue
                return false;
            }
        };

        // Register the KeyEventDispatcher with the KeyboardFocusManager
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(dispatcher);





        // ** this part may become redundant **
        // Create a thread to keep the program running
        Thread thread = new Thread(() -> {
            while (true) {
                // Do nothing, just keep the program running
            }
        });

        thread.start();
    }




}
