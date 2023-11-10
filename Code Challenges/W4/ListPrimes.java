import java.util.ArrayList;
import java.util.Scanner;

class ListPrimes
{

    public static boolean isPrime(int number) 
    {
        if (number <= 1) { return false; }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) { return false; }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        
        int nPrimes = 0;
        System.out.println("Primes less than " + input + ": ");
        long startTime = System.nanoTime();
        
        for (int number = 0; number <= input; number++) {
            if (isPrime(number)) { 
                System.out.println(number);
                nPrimes++;
            }
        }
        System.out.println("Total number of primes less than " + input + ": " + nPrimes);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken: " + duration + " nanoseconds");

    }
}