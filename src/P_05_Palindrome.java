import java.util.Scanner;

/**
 * Palindrome Number
 */
public class P_05_Palindrome {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        isPalindrome(num);
        sc.close(); // close the scanner object
    }

    public static void isPalindrome(int num){
        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        } else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
