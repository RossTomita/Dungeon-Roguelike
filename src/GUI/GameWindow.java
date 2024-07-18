package GUI;

import Observer.MouseObserver;
import Observer.MouseSubject;

import javax.swing.*;
import java.awt.*;
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
                notifyObservers_ME("Mouse Clicked", e.getX(), e.getY());




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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(x, y);
        setLayout(new BorderLayout(20, 15));
        setLocationRelativeTo(null);


        setVisible(true);


        // You need to add the mouse listener to a specific component, for example, a JFrame or JPanel
        // Assuming 'frame' is your JFrame or 'panel' is your JPanel
        this.addMouseListener(mouseListener);  // or panel.addMouseListener(mouseListener);
    }


    public void paint() {
        super.paint(getGraphics());
    }



    // Observer Methods
    @Override
    public void addObserver(MouseObserver o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers_ME(String me, int x, int y) {
        for (MouseObserver o : observers) {
            o.updateMouseEvent(me, x, y);
        }
    }


    // GUI.GameWindow Operations


}


