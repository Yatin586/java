import java.util.Scanner;

public class IllegalArgumentDemo {
    // Method to generate the Exception (no handling)
    public static void generateException(String text) {
        // Start index greater than end index → IllegalArgumentException
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2); // invalid
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Uncomment to see unhandled exception (program will stop)
        // generateException(input);

        // Handled exception
        handleException(input);
    }
}

