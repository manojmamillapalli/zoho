package round_2;
import java.util.*;
public class MatrixMul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of the matrix 1:");
		int row1=sc.nextInt();
		System.out.println("Enter the cols of the matrix1");
		int col1=sc.nextInt();
		int[][] arr1=new int[row1][col1];
		System.out.println("Enter the rows of the matrix2");
		int row2=sc.nextInt();
		System.out.println("Enter the cols ofthe matrix2");
		int col2=sc.nextInt();
		int[][] arr2=new int[row2][col2];
		int[][] arr3=new int[row1][col2];
		if(col1!=row2)
		{
			System.out.println("Error input:");
		}
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<col1;k++)
				{
					arr3[i][j]=arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
