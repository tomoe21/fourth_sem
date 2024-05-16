package generics2;
import java.util.*;

public class q9 {
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 5, 6}; 
        printRepeatingIntegers(arr);
    }

    public static void printRepeatingIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); 
        HashSet<Integer> repeat = new HashSet<>(); 
 
        for (int num : nums) { 
            if (!seen.add(num)) {
                repeat.add(num);
            }  
        } 
        if (repeat.isEmpty()) {
            System.out.println("No repeating integers.");
        } else {
            System.out.println("Repeating integers: " );
            for(int num:repeat)
            {
            	System.out.println(num);
            }
        }
    }
} 
