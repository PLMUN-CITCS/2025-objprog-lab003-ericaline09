import java.util.Scanner; // Import Scanner class for input handling

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner input = new Scanner(System.in);

        // Prompt for and input an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for and input a decimal number (double)
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume the newline character left by nextDouble()
        input.nextLine(); // This clears the buffer so we can safely read the string

        // Prompt for and input a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output the integer
        System.out.printf("Your integer: %d%n", userInt);

        // Output the decimal number, formatted to 2 decimal places
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output the string
        System.out.printf("Your string: %s%n", userString);

        // Close the Scanner to release resources
        input.close();
    }
}
