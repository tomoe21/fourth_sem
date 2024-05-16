package error_handling;
import java.util.Scanner;

public class q10 {
	
	public static double calculateExpression(double x) {
        if (Math.abs(x - Math.PI / 2) < 1e-10 || Math.abs(x + Math.PI / 2) < 1e-10) 
            throw new ArithmeticException("Denominator tan(x) is approaching towards zero.");
        
        return (Math.sin(x) + Math.cos(x)) / Math.tan(x);
    }
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of x in radians: ");
        double x = sc.nextDouble();
        
        try {
        	double result = calculateExpression(x);
            System.out.println("Result of the expression: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        sc.close();
    }
    
    
} 
