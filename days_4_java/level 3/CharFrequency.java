import java.util.Scanner;

public class CharFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        String[][] result = new String[len][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }

        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] freqArray = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (String[] row : freqArray) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}
