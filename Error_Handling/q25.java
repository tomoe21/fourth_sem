package error_handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter a number: ");
			int input=sc.nextInt();
			System.out.println("You entered: "+input);
		}catch(InputMismatchException e) {
			System.err.println("Enter an integer type data: "+e.getMessage());
		}finally {
			sc.close();
		}
	}

}
