import java.util.Scanner;
public class ClassExercise_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some numbers:");
		int n;
		long sum = 0;
		while(true) {
			n = input.nextInt();
			if(n == 0) {
				break;
			}
			sum += n;
		}
		System.out.printf("The sum of the numbers is: %d",sum);
	}

}
