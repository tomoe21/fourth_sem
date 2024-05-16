package error_handling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("abc.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
