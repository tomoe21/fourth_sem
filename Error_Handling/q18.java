package error_handling;
public class q18 {

	public static int calculateArraySum(int[] array, int index) {
		if (index >= array.length) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds.");
		}
		int currentElement = array[index];
		int sumOfRest = calculateArraySum(array, index + 1); 
		return currentElement + sumOfRest;
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		try {
			int sum = calculateArraySum(array, 0);
			System.out.println("Sum of array elements: " + sum);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds."+e.getMessage());
		}
	}
}
