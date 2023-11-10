import java.util.Scanner;

public class SumThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a lower bound: ");
        int int1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter an upper bound: ");
        int int2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Sum of every third number between " + int1 + " and " + int2 + " is: ");
        System.out.println(sumThird(int1, int2));
    }
    
    public static int sumThird(int lower, int upper) {
        int sum = 0;
        for (int num = lower; num < upper; num++) {
            if (num % 3 == 0) {
                sum += num;
            }
            
        }
        return sum;
    }
}
