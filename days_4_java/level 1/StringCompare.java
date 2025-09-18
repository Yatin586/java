import java.util.Scanner;

public class StringCompare {
    // Method to compare strings manually using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Different lengths → not equal
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare manually and using equals()
        boolean manualCompare = compareUsingCharAt(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        // Display results
        System.out.println("Manual Comparison Result: " + manualCompare);
        System.out.println("Built-in equals() Result: " + builtInCompare);
    }
}

