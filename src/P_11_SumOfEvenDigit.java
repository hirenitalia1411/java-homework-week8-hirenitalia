import java.util.Scanner;

/**
 *  Even Digit Sum
 */
public class P_11_SumOfEvenDigit {

    // main method where input has been taken form user using scanner class object
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(sumEvenDigits(num));
        sc.close(); // close the scanner object
    }

    public static int sumEvenDigits(int number) {
        int digit;
        int sum = 0;

        // process for positive number
        if (number >= 0) {
            while (number != 0) {
                digit = number % 10; // taking the last digit

                // divide the number by 2 to check even number
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number = number / 10; // discarding the last digit
            }
            return sum;
        } else {
            return -1; // if the number is negative then returns -1
        }
    }
}
