import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize count variable
        int count = 0;

        // Step 3: Use loop until number becomes 0
        while (number != 0) {
            // Step 3.1: Remove the last digit
            number /= 10;

            // Step 3.2: Increment count
            count++;
        }

        // Step 4: Display the result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
