import java.util.Scanner;

public class StringAnalyzer {

    private char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private int[] frequency = new int[26];

    private Scanner scan;
    private String input;

    public static void main(String[] args) {
        StringAnalyzer myAnalyzer = new StringAnalyzer();

        myAnalyzer.start();
    }

    private void start() {
        getString();
        analyzeString();
        reportAnalysis();

        System.out.println("Goodbye");
    }

    // Get string from user
    private void getString() {
        scan = new Scanner(System.in);
        System.out.println("Please enter a string of text for analysis:");
        input = scan.nextLine().toLowerCase();
    }

    private void analyzeString() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Check if letter is valid
                frequency[ch - 'a']++;
            }
        }
    }

    private void reportAnalysis() {
        System.out.println("\nLetter Analysis:");

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i] + ": " + frequency[i]);
        }
    }
}
