import java.util.Scanner;
public class SeventhTask {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter an integer number: ");
		int number = input.nextInt();
		input.close();
		boolean dividing;
		if((number % 5 == 0) && (number % 7 == 0)) {
			dividing = true;
		}
		else {
			dividing = false;
		}
		System.out.println(dividing);
	}

}
