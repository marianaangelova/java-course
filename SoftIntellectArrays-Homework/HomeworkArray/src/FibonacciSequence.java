import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for(long i = 0,previous = 0,current = 1;i < number;i++) {
			System.out.print(previous + " ");
			long temp = current;
			current += previous;
			previous = temp;
		}
	}

}
