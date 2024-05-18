import javax.swing.*;

public class GameWindow extends JFrame {

    // Constructor
    public GameWindow(int x, int y) {

        setTitle("new Window");
        setSize(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("HELLO");
        getContentPane().add(label);
        setVisible(true);
    }

    // GameWindow Operations


}
