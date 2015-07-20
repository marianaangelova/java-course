import java.util.Scanner;
public class NumbersFrom1ToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		for(int i = 1;i <= n;i++) {
			System.out.print(i+" ");
		}
	}

}
