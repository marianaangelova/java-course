import java.util.Scanner;
public class NFactorialKFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter k: ");
		int k = input.nextInt();
		System.out.println("Enter n(N < K): ");
		System.out.println("  1 < K < N  ");
		int n = input.nextInt();
		if((k >= n) || (k <=0) || (n <= 0)) {
			System.out.println("Invalid arguments!");
			return;
		}
        long factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        long factorialk = 1;

        for (int i = 1; i <= k; i++)
        {
            factorialk = factorialk * i;
        }

        System.out.println("N!/K! =  " + factorial / factorialk);
	}
}
