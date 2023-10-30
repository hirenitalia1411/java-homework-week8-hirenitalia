public class P_08_TriangleUsingNestedIf {
    /**
     * Display right angle triangle of @ using nested for loops
     */
    public static void main(String[] args) {
        // use of nested for loop for printing triangle
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
