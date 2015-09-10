import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of square matrix:");
		int matrixLength = input.nextInt();
		int rows = matrixLength;
		int cols = matrixLength;
		System.out.println("Fill the matrix:");
		Matrix matrix = new Matrix(matrixLength);
		int[][] array = matrix.fillMatrix(matrixLength);
		System.out.println("Your matrix contains the numbers:"+Arrays.deepToString(array));
		StringBuilder rotated = new StringBuilder();
		System.out.println("After rotation your matrix looks like:");
		for (rows = 0; rows < matrixLength ; rows++) {
			rotated.append("[");
			 for (cols = matrixLength-1; cols >= 0; cols--) {
				 System.out.print(array[cols][rows]+" ");
				 rotated.append(array[cols][rows]+" ");
				}
			 rotated.append("]");
			 System.out.println();
			}
		String rotatedArray = rotated + "";
		writeInFile(rotatedArray);
		
	}
	public static void writeInFile(String rotatedArray){
		FileWriter writer = null;
		try {
			writer = new FileWriter("rotatedArray.txt");
			writer.write(rotatedArray);
		} catch (IOException ioe) {
			System.out.println("Error writing in file!");
			ioe.printStackTrace();
		}finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
