import java.util.Scanner;

public class ReversedArray {

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
		System.out.println("Before reversing: ");
		for(int item:array) {
        	System.out.print(item+" ");
        }
		int temp;
        for (int i = 0; i < array.length/2; i++)
        {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println();
        System.out.println("After reversing: ");
        for(int item:array) {
        	System.out.print(item+" ");
        }
	}

}
