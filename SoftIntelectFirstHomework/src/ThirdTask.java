import java.util.Scanner;
import java.io.PrintStream;
public class ThirdTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		String name = input.nextLine();
		int ages = input.nextInt();
		char gender;
		gender = input.next().charAt(0);
		long identityNumber = input.nextLong();
		long phoneNumber = input.nextLong();
		
		System.out.println(name);
		System.out.println(ages);
		System.out.println(gender);
		System.out.println(identityNumber);
		System.out.println(phoneNumber);
	}

}
