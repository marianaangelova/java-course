import java.util.Scanner;

public class IsSymetric {

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
		System.out.println("This is your array: ");
		for(int i = 0;i < n;i++) {
			System.out.print(array[i]+" ");
		}
		boolean isSymetric = true;
		int arrLength = array.length - 1;
        for (int i = 0; i < array.length / 2; i++)
        {
            if (array[i] != array[arrLength - i])
            {
                isSymetric = false;
            }
        }
        System.out.println();
        System.out.printf("Is symertic? %s",isSymetric);
	}

}