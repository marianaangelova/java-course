package sortNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer[] numbers = new Integer[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		ArrayList<Integer>evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer>oddNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenNumbers.add(numbers[i]);
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				oddNumbers.add(numbers[i]);
			}
		}
		
		Integer[] evenArray = new Integer[evenNumbers.size()];
		for (int i = 0; i < evenArray.length; i++) {
			evenArray[i] = evenNumbers.get(i);
		}
		
		Integer[] oddArray = new Integer[oddNumbers.size()];
		for (int i = 0; i < oddArray.length; i++) {
			oddArray[i] = oddNumbers.get(i);
		}
		
		Arrays.sort(evenArray);
		Arrays.sort(oddArray);
		for (int i = 0; i < oddArray.length/2; i++) {
			int temp = oddArray[i];
			oddArray[i] = oddArray[oddArray.length - i - 1];
			oddArray[oddArray.length - i - 1] = temp;
		}
		for (Integer arr:evenArray) {
			System.out.print(arr+" ");
		}
		System.out.println();
		for (Integer arr:oddArray) {
			System.out.print(arr+" ");
		}
	}

}
