package error_handling;
public class q20 {

	public static void traverseArray(int[] array, int index) {
		if (index >= array.length) {
			System.out.println("Traversal completed.");
			return;
		}
		try {
			System.out.println("Element at index " + index + ": " + array[index]);
			traverseArray(array, index + 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 2, 3, 4, 5};
		traverseArray(array,0);
	}

}
