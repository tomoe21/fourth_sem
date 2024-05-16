package error_handling;
class CustomCheckedException extends Exception {
	public CustomCheckedException(String message) {
		super(message);
	}
}


public class q22 {
	
	static int performOperation(int dividend, int divisor) throws CustomCheckedException {
		if (divisor == 0) {
			throw new CustomCheckedException("Division by zero is not allowed.");
		}
		return dividend / divisor;
	}
	
	public static void main(String[] args) {
		try {
			int result = performOperation(10, 0);
			System.out.println("Result of operation: " + result);
		} catch (CustomCheckedException e) {
			System.err.println("CustomCheckedException caught: " + e.getMessage());
		}
	}
}
