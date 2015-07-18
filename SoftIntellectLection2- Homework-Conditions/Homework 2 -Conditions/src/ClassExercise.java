import java.util.Scanner;
public class ClassExercise {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		if((number > 0) && (number < 6)) {
			if(number % 2 == 0) {
				System.out.println("Number is even.");
			}else {
				System.out.println("Number is odd.");
			}
		}
		else if((number > 5) && (number < 16)) {
			if(number % 3 == 0) {
				System.out.println("Number is dividible by 3.");
			}else {
				System.out.println("Number is not dividible by 3.");
			}
		}
		else {
			if(number > 0) {
				System.out.println("Number is positive.");
			}else if(number < 0) {
				System.out.println("Number is negative.");
			}else {
				System.out.println("Zero");
			}
		}
	}

}
