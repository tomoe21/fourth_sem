package generics2;
import java.util.HashMap;

public class q8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent"; 
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) { 
        HashMap<Character, Integer> charCountMap = new HashMap<>(); 
        for (char c : str1.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        } 
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        return true;
    }
} 
