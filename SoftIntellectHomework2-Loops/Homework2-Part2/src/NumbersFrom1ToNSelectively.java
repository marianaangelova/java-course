
import java.util.Scanner;
public class NumbersFrom1ToNSelectively {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int number = input.nextInt();
		
		for(int i = 1;i <= number;i++) {
			if((i % 3 == 0) || (i % 7 == 0)) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}