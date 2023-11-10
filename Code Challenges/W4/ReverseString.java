import java.util.Scanner;

public class ReverseString {

    public static String reverse(String stringToReverse)
    {
        String reversedString = "";
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            char charToAdd = stringToReverse.charAt(i);
            if (Character.isUpperCase(charToAdd)) {
                reversedString += Character.toLowerCase(charToAdd);
            } else {
                reversedString += Character.toUpperCase(charToAdd);
            }
        }
        return reversedString;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String stringToReverse = scanner.nextLine();
        System.out.println("Reversed string: ");
        System.out.println(reverse(stringToReverse));
        
    }
}
