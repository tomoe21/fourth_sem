import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request a sentence and two words from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();
        System.out.print("Enter a word to replace it with: ");
        String replaceWord = scanner.nextLine();

        // Find the first occurrence of the search word in the sentence
        int index = sentence.indexOf(searchWord);

        // Replace the word using substring operations and concatenation
        String modifiedSentence = sentence.substring(0, index) + replaceWord + sentence.substring(index + searchWord.length());

        // Display the original and the modified sentences
        System.out.println("\nOriginal Sentence: " + sentence);
        System.out.println("Modified Sentence: " + modifiedSentence);

        scanner.close();
    }
}

