import java.util.Scanner;
public class SignOfRealNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two real numbers: ");
		float firstFloat = input.nextFloat();
		float secondFloat = input.nextFloat();
		System.out.print("The sign after dividing your numbers is: ");
		if((firstFloat > 0) && (secondFloat > 0)||(firstFloat < 0) && (secondFloat < 0)) {
			System.out.println("\"+\"");
		}
		else if((firstFloat > 0) && (secondFloat < 0)||(firstFloat > 0) && (secondFloat < 0)) {
			System.out.println("\"-\"");
		}
		else {
			System.out.println("\"0\"");
		}
	}

}
