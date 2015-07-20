import java.util.Scanner;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n for array length:");
		int n = input.nextInt();
		int sum = 0;
		int [] array = new int[n];
		System.out.println("Fill the array");
		for(int i = 0;i < n;i++) {
			array[i] = input.nextInt();
		}
		for(int i = 0;i < n;i++) {
			if(array[i]%2==0) {
				sum += array[i];
			}
		}
		System.out.println("Sum of even numbers in array is: "+sum);
	}

}
