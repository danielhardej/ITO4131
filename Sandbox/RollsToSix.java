package Sandbox;
import java.util.Random;

public class RollsToSix {

    public double experiment(int numTrials) {
        double avgRollsToSix = 0.0;
        double sumRollsToSix = 0.0;
        for (int i = 0; i < numTrials; i++) {
            Random rand = new Random();
            int roll = rand.nextInt(6) + 1;
            int rollsToSix = 1 ;
            while (roll != 6) {
                roll = rand.nextInt(6) + 1;
                rollsToSix++;
            }
            sumRollsToSix += rollsToSix;
        }
        avgRollsToSix = sumRollsToSix / numTrials;
        return avgRollsToSix;
    }

    public static void main(String[] args) {
        // repeat experiment 100 times
        RollsToSix rollsToSix = new RollsToSix();
        for (int i = 0; i < 100; i++) {
            double avgRollsToSix = rollsToSix.experiment(1000);
            System.out.println("Average rolls to six: " + avgRollsToSix);
        }
    }
}
