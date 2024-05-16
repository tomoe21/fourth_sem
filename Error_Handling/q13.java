package error_handling;
import java.util.Scanner;

public class q13 {
	
	public static double evaluateFunction(double x) throws ArithmeticException {
        double sinX = Math.sin(x);
        double cosX = Math.cos(x);
        double numerator = sinX * cosX;
        double denominator = sinX + cosX;

        if (isCloseToMultipleOfPiOver2(x)) {
            throw new ArithmeticException("Denominator is tending towards zero.");
        }

        return numerator / denominator;
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
            double result = evaluateFunction(x);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
        	sc.close();
        }
    }

    
} 
