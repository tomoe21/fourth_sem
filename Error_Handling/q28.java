package error_handling;
public class q28 {
	static void incrementMethod(int i) {
		System.out.println(i);
		incrementMethod(i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			incrementMethod(1);
		}catch(StackOverflowError e) {
			System.err.println("Stack overflow error occurred: ");
		}
	}

}
