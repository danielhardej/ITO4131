import java.util.Scanner;

/**
 * Player class to store player information.
 */
public class Player {
    private String name;
    private int score;

    /**
     * Parameterized constructor for Player class.
     * @param name Name of the player.
     * @param score Score of the player.
     */
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Method to display player information.
     */
    public void displayPlayerInfo() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Score: " + this.score);
    }
}