import java.util.Scanner;
public class Fill4X4Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		System.out.println("Enter 16 numbers to fill the matrix[rows][cols]:");
		for (int rows = 0; rows < matrix.length; rows++) {
		 for (int cols = 0; cols < matrix[0].length; cols++) {
			 matrix[rows][cols] = input.nextInt();
			}
		}
		System.out.println("Matrix before multiplaying odd numbers:");
		for (int rows = 0; rows < matrix.length; rows++) {
			 for (int cols = 0; cols < matrix[0].length; cols++) {
				 System.out.print(matrix[rows][cols]+" ");
				}
			 System.out.println();
			}
		for (int rows = 0; rows < matrix.length; rows++) {
			 for (int cols = 0; cols < matrix[0].length; cols++) {
				 matrix[rows][cols] *= 2;
				}
			}
		System.out.println("Matrix after multiplaying odd numbers:");
		for (int rows = 0; rows < matrix.length; rows++) {
			 for (int cols = 0; cols < matrix[0].length; cols++) {
				 System.out.print(matrix[rows][cols]+" ");
				}
			 System.out.println();
			}
	}
}
