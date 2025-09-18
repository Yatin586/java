import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Step 3: Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Step 3.1: Get the last digit (remainder)
            int digit = originalNumber % 10;

            // Step 3.2: Find cube of digit and add to sum
            sum += digit * digit * digit;

            // Step 3.3: Remove last digit by dividing by 10
            originalNumber /= 10;
        }

        // Step 4: Check if number is Armstrong or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
