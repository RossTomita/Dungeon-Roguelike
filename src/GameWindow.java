import javax.swing.*;

public class GameWindow extends JFrame {

    // Constructor
    public GameWindow() {

        setTitle("new Window");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("HELLO");
        getContentPane().add(label);
        setVisible(true);
    }

    // GameWindow Operations


}
