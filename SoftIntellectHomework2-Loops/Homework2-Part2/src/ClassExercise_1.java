import java.util.Scanner;
public class ClassExercise_1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter m: ");
		int m = input.nextInt();
		long result = 1;
		
		for(int i = 0;i < m;i++) {
			result*=n;
			}
		System.out.printf("n^m = %d",result);
		}
}
