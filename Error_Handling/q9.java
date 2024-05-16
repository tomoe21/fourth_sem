package error_handling;
  
import java.util.Scanner;

public class q9 {
	
	 public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Divisor can't be zero.");
	        }
	        return dividend / divisor;
	    }
	 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
        int  dividend= sc.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        
        try {
            int result = divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
        sc.close();
    }
    
   
} 
