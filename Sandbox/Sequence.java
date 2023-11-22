import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Sequence {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of values: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        Collections.reverse(Arrays.asList(inputArray)); 
        String output = String.join(" ", inputArray);
        System.out.println("The reversed sequence of values: ");
        System.out.println(output);  
    }
}