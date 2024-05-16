package error_handling;
import java.util.Scanner;

public class q12 {
	
	 public static double calculateExpressionValue(double x) throws ArithmeticException {
	        double sinX = Math.sin(x);
	        double cosX = Math.cos(x);
	        double tanX = Math.tan(x);

	        if (isCloseToMultipleOfPiOver2(x)) {
	            throw new ArithmeticException("Denominator is tending towards zero.");
	        }

	        double expressionInsideSqrt = Math.abs(sinX * cosX);

	        if (expressionInsideSqrt < 0) {
	            throw new ArithmeticException("Square root of a negative number is a complex number.");
	        }

	        double denominator = tanX + 1;

	        return Math.sqrt(expressionInsideSqrt) / denominator;
	    }

	    public static boolean isCloseToMultipleOfPiOver2(double x) {
	        double remainder = x % (Math.PI / 2);
	        return Math.abs(remainder) < 1e-10;
	    }
	    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = sc.nextDouble();

        try {
            double result = calculateExpressionValue(x);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
        	sc.close();
        }
    }

   
} 
