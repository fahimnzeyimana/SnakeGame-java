import javax.swing.*;

public class GoSnake extends JFrame {
    GoSnake(){
        add(new GamePanel());
        setTitle("Snake Game");
        setSize(750,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
