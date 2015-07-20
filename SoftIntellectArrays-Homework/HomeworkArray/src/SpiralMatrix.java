import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter rows=cols for square matrix: ");
        int n=input.nextInt();;

        int A[][]=new int[n][n];
        int counter=1, cols1=0, cols2=n-1, rows1=0, rows2=n-1;

        while(counter<=n*n)
            {
                for(int i=cols1;i<=cols2;i++)
                {
                    A[rows1][i]=counter++;
                }

                for(int j=rows1+1;j<=rows2;j++)
                {
                    A[j][cols2]=counter++;
                }

                for(int i=cols2-1;i>=cols1;i--)
                {
                    A[rows2][i]=counter++;
                }

                for(int j=rows2-1;j>=rows1+1;j--)
                {
                    A[j][cols1]=counter++;
                }

             cols1++;
             cols2--;
             rows1++;
             rows2--;
            }

        /* Printing the Circular matrix */
        System.out.println("The spiral matrix is:");
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    {
                        System.out.print("["+A[i][j]+"]"+" ");
                    }
             System.out.println();
             System.out.println();
            }
	}

}
