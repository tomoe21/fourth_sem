 package error_handling;
public class q1 {

    public static void main(String[] args) {
        String input = "ab1b2c3d4e5ef6";
        
        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Input string is null or empty.");
            }
            
            boolean found = false;
            for (int i = 0; i < input.length() - 2; i++) {
                char current = input.charAt(i);
                char next = input.charAt(i + 1);
                char nextNext = input.charAt(i + 2);
                
                if (isVowel(current) && !Character.isDigit(next) && Character.isDigit(nextNext)) {
                    System.out.println(nextNext);
                    found = true;
                }
            }
            
            if (!found) {
                System.out.println("No numeric characters preceded by a vowel and consonant found.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
