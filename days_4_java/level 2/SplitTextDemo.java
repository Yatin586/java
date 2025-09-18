import java.util.Scanner;

public class SplitTextDemo {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) { }
        return count;
    }


    public static String[] manualSplit(String text) {
        int len = findLength(text);

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        words[index] = text.substring(start, len);

        return words;
    }


    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();


        String[] manualWords = manualSplit(text);


        String[] builtInWords = text.split(" ");


        boolean same = compareArrays(manualWords, builtInWords);

        System.out.println("Manual Split:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("Built-in Split:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("Both splits are equal? " + same);
    }
}

