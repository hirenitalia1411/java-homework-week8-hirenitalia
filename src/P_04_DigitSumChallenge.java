import java.util.Scanner;

/**
 *  Digit Sum Challenge
 */
public class P_04_DigitSumChallenge {

    public static void sumDigits(int number){
        if (number>=10){
          int sum = 0;
            while(number>0){
                sum = sum + (number%10); // to get last digit ans sum with previous last digit
                number = number / 10; // to get remaining number after removing last digit
            }
            System.out.println("Addition of digits is: " + sum);
        }
        System.out.println(-1); // if number is not greater than equal to 10 then return -1
    }

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3 digit number: ");
        int number = sc.nextInt();
        sumDigits(number);
        sc.close(); // close the scanner object
    }
}
