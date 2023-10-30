import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 */
public class P_10_ArmstrongNumber {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isArmstrongNumber(num);
        sc.close(); // close the scanner object
    }

    public static void isArmstrongNumber(int number){

        int originalNumber, remainder, result = 0;

        originalNumber = number; // taking a copy of original number for comparison

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10; // taking out the last digit by modulus
            result += Math.pow(remainder, 3); // taking power of 3 of traced number
            originalNumber /= 10; // discarding the last digit for the further process
        }

        // comparing original number and resultant number
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
