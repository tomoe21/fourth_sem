public class q2 {
    public static void main(String[] args) {
        // Demonstrating immutability of String
        String original = "hello";
        System.out.println("Original string: " + original);

        // Concatenating "world" to the original string
        String modified = original.concat(" world");
        System.out.println("Modified string: " + modified);

        // The original string remains unchanged
        System.out.println("Original string after modification: " + original);

        // Demonstrating usage of String as a CharSequence
        CharSequence charSeq = "hello";
        System.out.println("\nCharSequence representation of String:");

        // Using CharSequence methods to access characters
        for (int i = 0; i < charSeq.length(); i++) {
            System.out.println("Character at index " + i + ": " + charSeq.charAt(i));
        }

        // Demonstrating how String can be passed to methods accepting CharSequence
        printCharSequence(charSeq);
    }

    // Method accepting CharSequence
    public static void printCharSequence(CharSequence cs) {
        System.out.println("\nPrinting CharSequence:");
        System.out.println("Length: " + cs.length());
        System.out.println("Subsequence from index 1 to 3: " + cs.subSequence(1, 4));
    }
}

