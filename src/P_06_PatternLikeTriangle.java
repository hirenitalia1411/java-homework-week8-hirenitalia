import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 */
public class P_06_PatternLikeTriangle {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of raw required: ");
        int rowNumber = sc.nextInt();
        trianglePrint(rowNumber);
        sc.close(); // close the scanner object
    }

    public static void trianglePrint(int r){
        // use of nested for loop
        for (int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
