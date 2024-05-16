package error_handling;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the value for x");
			int x = sc.nextInt();
			double sinx = Math.sin(x);
			double cosx = Math.cos(x);
			double tanx = Math.tan(x);
			double cotx = 1/tanx;
			double numerator = Math.log(sinx + cosx);
			double denominator = (tanx - cotx);
			if(denominator==0)
			{
				throw new ArithmeticException("Division by zero not possible");
			}
			double result = numerator/denominator;
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}

	}

}
