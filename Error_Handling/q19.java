package error_handling;
import java.util.Arrays;
import java.util.Scanner;

public class q19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = {10, 5, 8, 2, 15};
		try {
			Arrays.sort(array);
			System.out.println("Sorted array: " + Arrays.toString(array));
			System.out.println("Enter the element to search:");
			int target = sc.nextInt();
			int index = Arrays.binarySearch(array, target);
			if (index >= 0) {
				System.out.println("Element found at index " + index);
			} else {
				System.out.println("Element not found in the array.");
			}
			System.out.println("Accessing elements at various indices:");
			System.out.println("Element at index 0: " + array[0]);
			System.out.println("Element at index 2: " + array[2]);
			System.out.println("Element at index 5: " + array[5]); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}finally {
			sc.close();
		}
	}
}