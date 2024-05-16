import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String initialString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(initialString);

        while (true) {
            System.out.println("\n--- Text Manipulation Menu ---");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters from the string");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter substring to add: ");
                    String substringToAdd = scanner.nextLine();
                    System.out.print("Enter position to add at: ");
                    int positionToAdd = scanner.nextInt();
                    stringBuilder.insert(positionToAdd, substringToAdd);
                    break;
                case 2:
                    System.out.print("Enter start index to remove: ");
                    int startIndexToRemove = scanner.nextInt();
                    System.out.print("Enter end index to remove: ");
                    int endIndexToRemove = scanner.nextInt();
                    stringBuilder.delete(startIndexToRemove, endIndexToRemove);
                    break;
                case 3:
                    System.out.print("Enter index to modify: ");
                    int indexToModify = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter character to replace with: ");
                    char charToReplaceWith = scanner.nextLine().charAt(0);
                    stringBuilder.setCharAt(indexToModify, charToReplaceWith);
                    break;
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String stringToConcatenate = scanner.nextLine();
                    stringBuilder.append(stringToConcatenate);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            // Print current state of string
            System.out.println("Modified String: " + stringBuilder.toString());
        }
    }
}
