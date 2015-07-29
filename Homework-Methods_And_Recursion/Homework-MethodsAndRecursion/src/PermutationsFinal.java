
import java.util.Scanner;

public class PermutationsFinal {
	
	public static int numbers;
	public static int[]array;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		numbers = input.nextInt();
		
		array = new int[numbers];
		for(int i = 0; i < numbers; i++){
			array[i] = i+1;
		}
		
		
		System.out.println("Permutations: ");
		
		printPermutation(array);
	}
	
	public static void printPermutation(int[] array){
		permutation(array, 0, array.length-1);
	}
	
	public static void permutation(int[] array, int firstNumber, int lastNumber){
		if(lastNumber - firstNumber == 0){
			print(array);
		} else if(lastNumber - firstNumber == 1){
	 			print(array);
	 			reverse(firstNumber, lastNumber, array);
	 			print(array);
	 			reverse(firstNumber, lastNumber, array);
			} else{
				for(int i = firstNumber, j = 0; i <= lastNumber; i++, j++){
					reverse(firstNumber, firstNumber+j, array);
					
					permutation(array, firstNumber+1, lastNumber);
					
					reverse(firstNumber, firstNumber+j, array);
				}
			}	
	}
	
	public static void reverse(int firstIndex, int lastIndex, int[] array){
		int tempVar = array[lastIndex];
		array[lastIndex] = array[firstIndex];
		array[firstIndex] = tempVar;
	}
	public static void print(int[] array){

		System.out.print("[");
		for(int i = 0; i < array.length; i++){
			System.out.print("["+array[i] +"]");
		}
		
		System.out.print("]");
		System.out.println();
	}
}