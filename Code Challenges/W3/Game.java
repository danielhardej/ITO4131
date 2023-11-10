import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Game extends JFrame {
    private List<String> moves = new ArrayList<>();

    public Game() {
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        moves.add("You moved up!");
                        System.out.println("You moved up!");
                        break;
                    case KeyEvent.VK_DOWN:
                        moves.add("You moved down!");
                        System.out.println("You moved down!");
                        break;
                    case KeyEvent.VK_LEFT:
                        moves.add("You moved left!");
                        System.out.println("You moved left!");
                        break;
                    case KeyEvent.VK_RIGHT:
                        moves.add("You moved right!");
                        System.out.println("You moved right!");
                        break;
                    case KeyEvent.VK_Q:
                        System.out.println("Game ended. Moves:");
                        System.out.println(moves);
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        });
        this.setFocusable(true);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Game();
    }
}