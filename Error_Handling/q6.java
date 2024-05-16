package error_handling;
import java.util.*;
public class q6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("ENter the value of x");
			double x = sc.nextDouble();
			double sinx = Math.sin(x);
			double cosx = Math.cos(x);
			double tanx = Math.tan(x);
			double cotx = 1/tanx;
			
			double numerator = Math.log(Math.abs(sinx+cosx));
			double denominator = (tanx-cotx);
			
			if(Math.abs(numerator)<0)
			{
				throw new ArithmeticException("Log function can't be negative");
			}
			if(Math.abs(denominator)==0)
			{
				throw new ArithmeticException("can not divide by zero");
			}
			
			double result = numerator/denominator;
			System.out.println("Result: " + result);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

	}

}
