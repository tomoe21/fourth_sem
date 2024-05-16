import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate strings using the string method and the + operator
        String concatenatedStringMethod = firstString.concat(secondString);
        String concatenatedStringOperator = firstString + secondString;

        // Display both results
        System.out.println("\nConcatenated String (Using concat method): " + concatenatedStringMethod);
        System.out.println("Concatenated String (Using + operator): " + concatenatedStringOperator);

        // Ask the user for an index number
        System.out.print("\nEnter an index number to retrieve character: ");
        int index = scanner.nextInt();

        // Display the character at that index
        if (index >= 0 && index < concatenatedStringMethod.length()) {
            char characterAtIndex = concatenatedStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Please enter a valid index within the range of the concatenated string.");
        }

        scanner.close();
    }
}

