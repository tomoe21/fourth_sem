package error_handling;
import java.util.Scanner;

public class q14 {

	public static double calculateExpression(double x) {

		if (Math.abs(x % Math.PI) < 1e-10) {
			throw new IllegalArgumentException("x cannot be a multiple of pi.");
		}

		double sinValue = Math.sin(x);
		double cosValue = Math.cos(x);
		double tanValue = Math.tan(x);
		double cotValue = 1.0 / tanValue; 

		if (Math.abs(tanValue - cotValue) < 1e-10) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}

		double expressionValue = Math.log(Math.abs(sinValue + cosValue)) / (tanValue - cotValue);

		if (sinValue + cosValue < 0) {
			throw new IllegalArgumentException("Log of a negative value is undefined.");
		}

		return expressionValue;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of x in radians: ");
		double x = scanner.nextDouble();

		try {
			double result = calculateExpression(x);
			System.out.println("Result of the expression: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: Invalid input. Ensure x is not a multiple of pi.");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}


} 