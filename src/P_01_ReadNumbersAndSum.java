import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 */
public class P_01_ReadNumbersAndSum {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1; // counter
        int sum = 0; // initialising sum variable as zero

        while(i<=10){
            System.out.print("Enter number " +i + ": ");
            //checking whether the entered number is integer or not using hasNextInt() method
            if(sc.hasNextInt()){
                int number = sc.nextInt();
                sum += number;
                i++;
            } else{
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        System.out.println("Sum of all numbers are: " + sum);
        sc.close(); // close the scanner object
    }
}
