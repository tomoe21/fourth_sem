package error_handling;
import java.util.*;
public class q3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the value of x");
			int x = sc.nextInt();
			double sinx = Math.sin(x);
			double cosx = Math.cos(x);
			if(sinx ==0 && cosx==0)
			{
				throw new IllegalArgumentException("x cannot be a multiple of pi/2");
			}
			double tanx = Math.tan(x);
			if(tanx == 0)
			{
				throw new ArithmeticException("Cannot divide by zero");
			}
			double result = (sinx+cosx)/tanx;
			System.out.println("result: " + result );
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		catch(IllegalArgumentException e)
		{
			System.err.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

	}

}
