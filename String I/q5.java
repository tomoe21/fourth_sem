import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter base string and number of concatenations
        System.out.print("Enter the base string: ");
        String baseString = scanner.nextLine();
        System.out.print("Enter the number of concatenations: ");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long timeTakenStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Print results for StringBuilder
        System.out.println("Using StringBuilder...");
        System.out.println("Time taken: " + timeTakenStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilder.length());

        // Using StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long timeTakenStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        // Print results for StringBuffer
        System.out.println("\nUsing StringBuffer...");
        System.out.println("Time taken: " + timeTakenStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBuffer.length());

        // Comparison
        long timeDifference = Math.abs(timeTakenStringBuilder - timeTakenStringBuffer);
        System.out.println("\nComparison: " + (timeTakenStringBuilder < timeTakenStringBuffer ? "StringBuilder" : "StringBuffer") +
                " was faster than " + (timeTakenStringBuilder < timeTakenStringBuffer ? "StringBuffer" : "StringBuilder") +
                " by " + timeDifference + " milliseconds");

        scanner.close();
    }
}

