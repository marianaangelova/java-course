
import java.util.Arrays;
import java.util.Scanner;


public class ReverseArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputString = input.nextLine();
		String result = reverseArray(inputString);
		
		System.out.println("Enter array length:");
		int n = input.nextInt();
		
		System.out.println("Fill the array:");
		int[] array = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		
		System.out.println(result);
		reverseArray(array);
		System.out.println(Arrays.toString(array));
		
	}
	public static  void reverseArray(int [] arrayToReverse) {
		
		
		for (int i = 0; i < arrayToReverse.length/2; i++) {
			int temp = arrayToReverse[i];
			arrayToReverse[i] = arrayToReverse[arrayToReverse.length - i - 1];
			arrayToReverse[arrayToReverse.length - i - 1] = temp;
		}
	}public static  String reverseArray(String stringToReverse) {
		
		String reversedString = "";
		for(int i=stringToReverse.length()-1;i>=0;i--){
			reversedString+=stringToReverse.charAt(i);
		}
		return reversedString;
	}
	
	
}
