import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n for array length: ");
		int n = input.nextInt();
		
		int[] array = new int[n];
		System.out.printf("Fill the array with %d numbers:",n);
		System.out.println();
		for(int i = 0;i < n;i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Array before bubble sort:");
		for(int i = 0;i < n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i = 0;i < n;i++) {
			for(int j = 1;j < (n - i);j++) {
				if(array[j - 1] > array[j]) {
					int temporaly = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temporaly;
				}
			}
		}
		System.out.println("Array after bubble sort:");
		for(int i = 0;i < n;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
