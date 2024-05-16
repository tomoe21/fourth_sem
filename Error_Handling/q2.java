package error_handling;
class CustomNullPointerException extends Exception
{
	public CustomNullPointerException(String msg)
	{
		super(msg);
	}
}
public class q2 {

	public static void main(String[] args) {
		String str = null;
		try 
		{
			if(str==null)
			{
				throw new CustomNullPointerException("The string is empty");
			}
			System.out.println(str.length());
		}
		catch(CustomNullPointerException e)
		{
			System.err.println(e.getMessage());
		}

	}

}
