import java.util.Scanner;
public class MaxValueOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max;
		if((a > b) && (a > c)) {
			max = a;
		}
		else if((b > a) && (b > c)) {
			max = b;
		}
		else {
			max = c;
		}
		System.out.println("Max value is: "+max);
	}

}
