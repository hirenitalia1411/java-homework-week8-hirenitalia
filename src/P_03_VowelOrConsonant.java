import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input is not a letter (between a and z or A and Z),
 * or is a string of length > 1, print an error message.
 */
public class P_03_VowelOrConsonant {

    // main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase(); // converting input values in to lowercase

        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122; // checking a-z OR A-Z using ASCII value
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(lowercase))
        {
            System.out.println("Error (Entered value is Not a character)");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }

        in.close(); // close the scanner object
    }

}
