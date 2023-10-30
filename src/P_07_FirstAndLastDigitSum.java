import java.util.Scanner;

/**
 * First And Last Digit Sum
 */
public class P_07_FirstAndLastDigitSum {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of raw required: ");
        int number = sc.nextInt();
        int sum = sumFirstAndLastDigit(number);
        System.out.println(sum);
        sc.close(); // close the scanner object
    }

    public static int sumFirstAndLastDigit(int n){
        int firstDigit = 0;
        int lastDigit = 0;

        if (n>=0) {
            lastDigit = n % 10; // to get the last digit

            // to get the first digit
            while (n != 0) {
                firstDigit = Math.abs(n % 10);
                n = n / 10;
            }
            return (lastDigit + firstDigit);
        }
        return -1; // return -1 is entered number is negative
    }
}
