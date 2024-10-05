
package com.multicoreware;
import java.util.*;
public class RotationOfMatrixWithoutExtraSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row value and column");
		int n= sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		transposeMatrix( arr);
		reverseRows( arr);
		System.out.println();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void transposeMatrix(int[][] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	public static void reverseRows(int[][] arr)
	{
		for(int[] row:arr)
		{
			int start=0;
			int end=row.length-1;
			while(start<end)
			{
				int temp=row[start];
				row[start]=row[end];
				row[end]=temp;
				start++;
				end--;
			}
			
		}
	}
	

}
