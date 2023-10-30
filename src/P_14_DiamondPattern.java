public class P_14_DiamondPattern {
    /**
     *
     * Write a program in Java to display the pattern like a diamond.
     * While loop
     */
    public static void main(String[] args)
    {
        // Variable initialized to the row where max star should be there
        int number = 7;
        int m = 1; // Diamond starting with single star in first row
        int n; // Columnar printing

        while (m <= number) {
            n = 1;

            // Inner loop 1
            while (n <= number - m) {
                System.out.print(" "); // Print whitespaces in between
                n++;
            }

            n = 1;
            // Inner loop 2
            while (n <= m * 2 - 1) {
                System.out.print("*"); // Print star
                n++;
            }

            System.out.println();
            m++;
        }

        // initialized should one lesser than number
        m = number - 1;

        while (m > 0) {
            n = 1;

            while (n <= number - m) {
                System.out.print(" "); // Print whitespace in between
                n++;
            }
            n = 1;
            // Inner loop 2
            while (n <= m * 2 - 1) {
                System.out.print("*"); // Print star
                n++;
            }

            System.out.println();
            m--;
        }
    }
}
