import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter 3 integers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		String resultA = checkingParity(a);
		String resultB = checkingParity(b);
		String resultC = checkingParity(c);
		
		System.out.println("a is "+resultA);
		System.out.println("b is "+resultB);
		System.out.println("c is "+resultC);
		
	}
	public static String checkingParity(int number) {
		String result;
		if (number % 2 == 0) {
			result = "even";
		}
		else {
			result = "odd";
		}
		return result;
	}
}