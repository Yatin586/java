public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println("Length: " + text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // Uncomment one at a time to see the difference

        // 1. Directly generates exception
        // generateException();

        // 2. Handles the exception safely
        handleException();
    }
}
