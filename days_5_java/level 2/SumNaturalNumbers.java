import java.util.Scanner;

public class SumNaturalNumbers {

    public static int sumRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0");
        } else {
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumForm);

            if (sumRec == sumForm) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("Results do not match.");
            }
        }

        sc.close();
    }
}

