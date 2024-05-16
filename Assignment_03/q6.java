package generics2;
import java.util.Scanner;
import java.util.TreeSet;

public class q6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
 
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(7);
 
        System.out.println("The TreeSet is: " + treeSet); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int num = scanner.nextInt();

        if (treeSet.contains(num)) {
            System.out.println("The number " + num + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + num + " is not present in the TreeSet.");
        } 
        System.out.println("Enter a number to remove: ");
        int numToRemove = scanner.nextInt();

        if (treeSet.remove(numToRemove)) {
            System.out.println("The number " + numToRemove + " has been removed from the TreeSet.");
        } else {
            System.out.println("The number " + numToRemove + " is not present in the TreeSet.");
        } 
        System.out.println("The updated TreeSet is: " + treeSet);

        scanner.close();
    }
} 
