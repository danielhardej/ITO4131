import java.util.Scanner;

public class Compare {
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter three values: ");
    //     int val1 = scanner.nextInt();
    //     int val2 = scanner.nextInt();
    //     int val3 = scanner.nextInt();
    //     // int temp = 0;
    //     // temp = (val1 > val2) ? val1 : val2;
    //     // int max = (temp > val3) ? temp : val3;
    //     int max = (((val1 > val2) ? val1 : val2) > val3) ? ((val1 > val2) ? val1 : val2) : val3;
    //     System.out.println("The values in order are: ");
    //     System.out.println(max);


    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three values: ");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int val3 = scanner.nextInt();
        int max, mid, min = 0;
        max = (((val1 > val2) ? val1 : val2) > val3) ? ((val1 > val2) ? val1 : val2) : val3;
        min = (((val1 < val2) ? val1 : val2) < val3) ? ((val1 < val2) ? val1 : val2) : val3;
        mid = (val1 > min && val1 < max) ? val1 : (val2 > min && val2 < max) ? val2 : val3;
        System.out.println("The values in order are: ");
        System.out.printf("%d %d %d\n", min, mid, max);
    }
}
