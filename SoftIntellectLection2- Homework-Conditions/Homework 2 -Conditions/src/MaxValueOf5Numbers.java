import java.util.Scanner;
public class MaxValueOf5Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int max;
		if((a > b) && (a > c) && (a > d) && (a > e)) {
			max = a;
		}
		else if((b > a) && (b > c) && (b > d) && (b > e)) {
			max = b;
		}
		else if((c > a) && (c > b) && (c > d) && (c > e)) {
			max = c;
		}
		else if((d > a) && (d > b) && (d > c) && (d > e)) {
			max = d;
		}
		else {
			max = e;
		}
		System.out.println("Max value is: "+max);
	}
}