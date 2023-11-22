public class ArrayBasics
{   
    public double getMaxScore(double[] scores)
    {
        double maxScore = scores[0];
        for (int i = 1; i < scores.length; i++)
        {
            if (scores[i] > maxScore)
            {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }

    public double getMinScore(double[] scores)
    {
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++)
        {
            if (scores[i] < minScore)
            {
                minScore = scores[i];
            }
        }
        return minScore;
    }

    public static void main(String[] args)
    {
        double[] testScores = {2.0, 3.0, 5.0, 7.0};
        double total=0, average;

        // Using for-loop
        for(int i = 0; i < testScores.length; i++)
        {
            total += testScores[i];
        }
        average = total / testScores.length;
        System.out.println("Average: " + average);

        // Using for-each-loop
        total = 0.0;
        for(double score : testScores)
        {
            total += score;
        }
        average = total / testScores.length;
        System.out.println("Average: " + average);

        double[] scoreList = {56.5, 34.5, 98, 67.4, 12.5, 99};
        System.out.println(scoreList[2]);

        System.out.println("Max: " + getMaxScore(scoreList));
        System.out.println("Min: " + getMinScore(scoreList));
    }
}