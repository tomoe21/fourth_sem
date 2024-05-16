package error_handling;
import java.util.*;
public class q7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the number as string");
			String input = sc.nextLine();
			
			try
			{
				int num = Integer.parseInt(input);
				
				try
				{
					int result = num/0;
					System.out.println("result: " + result);
				}
				catch(ArithmeticException e)
				{
					System.err.println(e.getMessage());
				}
			}
			catch(NumberFormatException e)
			{
				System.err.println(e.getMessage());
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

	}

}
