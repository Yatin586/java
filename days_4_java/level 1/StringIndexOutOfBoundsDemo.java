import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate the Exception (no handling)
    public static void generateException(String text) {
        // Access index beyond the string length
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            // Access index beyond the string length
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
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

