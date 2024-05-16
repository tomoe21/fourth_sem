package error_handling;
import java.util.Scanner;

public class q15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		String input = sc.nextLine();

		try {
			int number = Integer.parseInt(input);

			try {
				int result = 10 / number;
				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("A number can't be divided by zero: ");
			}
		} catch (NumberFormatException e) {
			System.out.println("Enter an integer to perform operation. You entered " + e.getMessage());
		}finally {
			sc.close();
		}

	}
} 