package error_handling;
import java.util.Scanner;

public class q11 {
	
	public static double calculateFunction(double x) {
        if (Math.abs(x % Math.PI) < 1e-10) {
            throw new IllegalArgumentException("x cannot be a multiple of pi because it makes tan and cot values undefined.");
        }
        
        if ((Math.tan(x) - (1.0 / Math.tan(x))) < 1e-10) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        
        double functionValue = Math.log(Math.sin(x) + Math.cos(x)) / (Math.tan(x) - (1.0 / Math.tan(x)));
        return functionValue;
    }
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of x in radians: ");
        double x = sc.nextDouble();
        
        try {
            double result = calculateFunction(x);
            System.out.println("Result of the function: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid input. Ensure x is not a multiple of pi.");
        } finally {
            sc.close();
        }
    }
    
    
} 
