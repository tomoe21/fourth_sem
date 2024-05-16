package error_handling;
import java.util.*;
public class q5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("NEter the value of x");
			int x = sc.nextInt();
			
			double sinx = Math.sin(x);
			double cosx = Math.cos(x);
			double tanx = Math.tan(x);
			
			double numerator = Math.sqrt(Math.abs(sinx*cosx));
			double denominator = (tanx+1);
			
			if(denominator<=0)
			{
				throw new ArithmeticException("division by zero or negative values");
			}
			double result = numerator/denominator;
			System.out.println("result: " + result);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}

	}

}
