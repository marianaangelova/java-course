import java.util.Scanner;
public class TriangleSides {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers and we will say you,"
				+ " if you can make a triangle with this size of the sides: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.println("possible");
		}
		else {
			System.out.println("impossible");
		}
	}

}
