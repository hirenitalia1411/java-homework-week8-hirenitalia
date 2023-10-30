import java.util.Scanner;

/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P_09_FibonacciNumber {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number up to which fibonacci series required: ");
        int number = sc.nextInt();
        fibonacci(number);
        sc.close(); // close the scanner object
    }

    public static void fibonacci(int num){
        int firstTerm = 0; // first number in fibonacci series
        int secondTerm = 1; // second number in fibonacci series

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + " ");

            // computing the next term by swapping the numbers
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
