import java.util.Scanner;
import java.util.Arrays;
public class SquareMatrix {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n*n numbers to fill the matrix[n][n]:");
		int n = input.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int rows = 0; rows < matrix.length; rows++) {
			 for (int cols = 0; cols < matrix[0].length; cols++) {
				 matrix[cols][rows] = input.nextInt();
				}
			}
		System.out.println(Arrays.deepToString(matrix));
		System.out.println();
		for (int rows = 0; rows < matrix.length; rows++) {
			 for (int cols = 0; cols < matrix[0].length; cols++) {
				 matrix[rows][cols] = input.nextInt();
				}
			}
		System.out.println(Arrays.deepToString(matrix));
	}

}
