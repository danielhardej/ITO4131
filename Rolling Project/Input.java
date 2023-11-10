/**
 * Input class
 * Used to take a user's input with adding a new student, enrolment, or unit
 * Ensures that a user enters the correct data type
 * 
 * @version 1.0
 * @author Daniel Hardej
 * Last updated: 2023-11-09
 */

import java.util.Scanner;

public class Input {
    
    public Input() {}

    public char acceptCharInput(String prompt, int idx) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        char inputChar = scanner.next().charAt(idx);
        return inputChar;
    }

    public double acceptDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    } 

    public int acceptIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int inputInt;
        try {
            inputInt = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Invalid input. Please enter a valid integer.");
            inputInt = scanner.nextInt();
        }
        return inputInt;
    }

    public String acceptStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String inputString = scanner.nextLine();
        while (!(inputString instanceof String)) {
            System.out.println("Invalid input. Please enter a valid string.");
            inputString = scanner.nextLine();
        }
        return inputString;
    }
}
