import java.util.Scanner;

public class BinarySearch {

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
		for(int i = 1;i < array.length;i++) {
			int index = array[i];
			int j = i;
			while(j > 0 && array[j-1] > index) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = index;
		}
		System.out.println("Your array after sorting: ");
		for(int i = 0;i < n;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		int first  = 0, last   = n - 1, middle = (first + last)/2;
		System.out.println("Enter value to find");
		int value = input.nextInt();
		while( first <= last )
	    {
	      if ( array[middle] < value )
	        first = middle;    
	      else if ( array[middle] == value ) 
	      {
	        System.out.println(value + " found at location " + middle + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(value + "is not valid for the array");
	  }
}

