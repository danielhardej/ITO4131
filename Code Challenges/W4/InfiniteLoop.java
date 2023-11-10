import java.util.Scanner;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        for (int number = 0; !"0".equals(input); number++) {
            System.out.println(number);
            System.out.println("Enter 0 to stop the loop or anything else to continue: ");
            input = scanner.nextLine();
        }

        scanner.close();
    }
}