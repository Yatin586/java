import java.util.Scanner;

public class NumberChecker2 {

    public static int countDigits(int number) {
        int n = Math.abs(number);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count == 0 ? 1 : count; // handle 0
    }

    public static int[] storeDigits(int number) {
        int num = Math.abs(number);
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sumSq = 0;
        for (int d : digits) sumSq += Math.pow(d, 2);
        return sumSq;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumDigits = sumOfDigits(digits);
        if (sumDigits == 0) return false;
        return number % sumDigits == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // count
        }
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digits count: " + countDigits(number));

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
        }

        sc.close();
    }
}
