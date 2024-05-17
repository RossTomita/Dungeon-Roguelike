import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;


// GameLoop
// Handle User Input
// Needs a timer


public class Controller {

    // CONSTRUCTOR: creates new Controller capable of handling user input
    public Controller() {

        // Create a KeyEventDispatcher to listen for key events
        KeyEventDispatcher dispatcher = new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                // check if the pressed key is the up arrow key
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("UP arrow key pressed!");

                    // Up arrow key function call to View



                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println("DOWN arrow key pressed!");

                    // Down arrow key function call to View



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



    // GameLoop




}
