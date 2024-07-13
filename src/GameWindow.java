import Observer.KeyObserver;
import Observer.MouseObserver;
import Observer.MouseSubject;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class GameWindow extends JFrame implements MouseSubject {
    ArrayList<MouseObserver> observers = new ArrayList<>();


    // Constructor
    public GameWindow(int x, int y) {


        // Create a MouseListener to listen for mouse events in this frame
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Handle mouse clicked events
                //notifyObservers_ME("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");

                System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
                // Sleep to ensure program doesn't run too fast

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // Handle mouse pressed events
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // Handle mouse released events
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // Handle mouse entered events
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Handle mouse exited events
            }
        };

        // set up the rest of the Frame
        setTitle("new Window");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("HELLO");
        getContentPane().add(label);
        setVisible(true);
        // You need to add the mouse listener to a specific component, for example, a JFrame or JPanel
        // Assuming 'frame' is your JFrame or 'panel' is your JPanel
        this.addMouseListener(mouseListener);  // or panel.addMouseListener(mouseListener);
    }



    // Observer Methods
    @Override
    public void addObserver(MouseObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers_ME(String me) {
        for (MouseObserver o : observers) {
            o.updateMouseEvent(me);
        }
    }


    // GameWindow Operations


}


