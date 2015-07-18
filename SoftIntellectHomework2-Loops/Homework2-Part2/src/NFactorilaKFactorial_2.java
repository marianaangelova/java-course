import java.util.Scanner;

public class NFactorilaKFactorial_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter k: ");
		int k = input.nextInt();
		System.out.println("Enter n: ");
		System.out.println("  1 < K < N  ");
		int n = input.nextInt();
		if((k >= n) || (k <=0) || (n <= 0)) {
			System.out.println("Invalid arguments!");
			return;
		}
		 System.out.println("  1 < K < N  ");

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
         int nk = n - k;

         long factorialnk = 1;

         for (int i = 1; i <= nk; i++)
         {
             factorialnk = factorialnk * i;
         }
         System.out.println("N!*K!/(N-K)!=  " + ((factorial * factorialk) / factorialnk));
	}

}
