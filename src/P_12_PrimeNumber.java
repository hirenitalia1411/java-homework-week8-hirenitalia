import java.util.Scanner;

/**
 *  Write a programme to input any number and check if it is prime or not.
 */
public class P_12_PrimeNumber {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String message = isPrime(num);
        System.out.println(message);
        sc.close(); // close the scanner object
    }

    public static String isPrime(int number) {
        if (number <= 1)
            return "Invalid Input";

        // prime number starts from 2 so initial condition is i=2
        // checking the reminder value from 2 to the given number for checking a prime number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "Not a Prime Number";
            }
        }
        return "Prime Number";
    }
}
