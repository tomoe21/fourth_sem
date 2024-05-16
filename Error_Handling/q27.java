package error_handling;
public class q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Object obj=Integer.valueOf(7);
			String str=(String) obj;
			System.out.println(str);
		}catch(ClassCastException e) {
			System.err.println("Exception occurred: "+e.getMessage());
		}
	}

}
