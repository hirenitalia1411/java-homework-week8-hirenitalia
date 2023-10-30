import java.util.Scanner;

/**
 *  Read the numbers from the console entered by the user and print the minimum
 *  and maximum number the user has entered.
 */
public class P_02_MinAndMaxNumber {

    // find max number in an user entered array
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    // find min number in an user entered array
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a total number you want to enter: ");
        int arraySize = sc.nextInt(); // array size

        // taking input from user and stored into an array
        int[] myArray = new int[arraySize]; // initialising the array
        for (int i=0; i<=arraySize-1; i++){
            System.out.print("Enter " + (i+1) + " number: ");
            myArray[i] = sc.nextInt();
        }

        P_02_MinAndMaxNumber m = new P_02_MinAndMaxNumber();
        System.out.println("Maximum value in the array is: "+m.max(myArray)); // calling a method MAX
        System.out.println("Minimum value in the array is: "+m.min(myArray)); // calling a method MIN
    }
}
