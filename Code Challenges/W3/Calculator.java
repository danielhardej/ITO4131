import java.util.Scanner;

/**
 * Calculator class to perform basic arithmetic operations.
 * 
 * The program accepts two numbers from the user through 
 * the keyboard and provides a list of mathematical operations,
 * which can then be performed on the two numbers provided.
 * 
 * The program then provides the result to the user on the screen. 
 * 
 * The available mathematical operations are as follows:
 * Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulus (%)
 */

public class Calculator
{
    /**
     * Main method to accept user input and perform mathematical operations.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the operation to be performed (+, -, *, /, or %): ");
        String operation = scanner.nextLine();
        double result = 0.0;
        switch(operation)
        {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break; 
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break; 
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
        System.out.println("The result is: " + result);
    }
}
