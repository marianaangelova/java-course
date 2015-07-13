import java.util.Scanner;
public class TenthTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter triangle side: ");
		int triangleSide = input.nextInt();
		System.out.print("Enter triangle height: ");
		int triangleHeight = input.nextInt();
		input.close();
		int triangleArea = (triangleSide*triangleHeight)/2;
		System.out.println("Triangle area is: "+triangleArea);
	}

}
