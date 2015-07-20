import java.util.Arrays;
import java.util.Scanner;

public class IndexOfFirstFoundNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = {10, 15, 22, 34, 12, 35, 8, 7, 6};
		System.out.println("Write any number of the following array:\n"+Arrays.toString(array)+"\n"+"n = "); 
		int n = input.nextInt();
		
		for(int i = 0;i < array.length;i++) {
			if(array[i] == n) {
				System.out.printf("The index of your number is: %d",i);
				break;
			}
		}
		
	}
}
