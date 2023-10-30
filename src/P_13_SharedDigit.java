import java.util.Scanner;

/**
 * Shared Digit
 */
public class P_13_SharedDigit {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number between 10 & 99: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter a second number between 10 & 99: ");
        int secondNumber = sc.nextInt();
        boolean result = hasSharedDigit(firstNumber,secondNumber);
        System.out.println(result);
        sc.close(); // close the scanner object
    }

    public static boolean hasSharedDigit(int fn, int sn){
        // condition is that number should be between 10-99
        if ((fn>=10 && fn<=99) && (sn>=10 && sn<=99)) {
            int firstDigitFirstNumber = (fn / 10);
            int lastDigitFirstNumber = (fn % 10);
            int firstDigitSecondNumber = (sn / 10);
            int lastDigitSecondNumber = (sn % 10);
            return (firstDigitFirstNumber == firstDigitSecondNumber) || (firstDigitFirstNumber == lastDigitSecondNumber) || (lastDigitFirstNumber == firstDigitSecondNumber) || (lastDigitFirstNumber == lastDigitSecondNumber);
        }
        return false;
    }
}
