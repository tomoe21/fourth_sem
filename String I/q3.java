import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer text = new StringBuffer("Hello world i am neha");

        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Append text");
            System.out.println("2. Insert text at index");
            System.out.println("3. Delete text between indices");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text between indices");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    text.append(appendText);
                    break;
                case 2:
                    System.out.print("Enter index to insert text: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    text.insert(insertIndex, insertText);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    text.delete(startIndex, endIndex);
                    break;
                case 4:
                    text.reverse();
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter text to replace with: ");
                    String replaceText = scanner.nextLine();
                    text.replace(replaceStartIndex, replaceEndIndex, replaceText);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }

            // Print current state of text
            System.out.println("\nCurrent Text: " + text.toString());
            System.out.println("Current Capacity: " + text.capacity());
            System.out.println("Current Length: " + text.length());
        }
    }
}

