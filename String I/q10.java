import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        while (true) {
            // Display menu options
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for an index");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("\nResult of converting to lowercase: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("\nResult of converting to uppercase: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("\nEnter a character to search: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    System.out.println("Index of '" + searchChar + "': " + inputString.indexOf(searchChar));
                    break;
                case 4:
                    System.out.print("\nEnter a substring to search: ");
                    String searchString = scanner.nextLine();
                    System.out.println("Index of '" + searchString + "': " + inputString.indexOf(searchString));
                    break;
                case 5:
                    System.out.print("\nEnter another string to concatenate: ");
                    String appendString = scanner.nextLine();
                    System.out.println("Concatenated string: " + inputString.concat(appendString));
                    break;
                case 6:
                    System.out.println("\nExiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

