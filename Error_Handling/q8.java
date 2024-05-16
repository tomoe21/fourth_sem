package error_handling;

public class q8 {

	public static void main(String[] args) 
	{
		int num[] = {1,2,3,4,5};
		try
		{
			int element = num[6];
			System.out.println("Number at index 6: " + element);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		

	}

}
