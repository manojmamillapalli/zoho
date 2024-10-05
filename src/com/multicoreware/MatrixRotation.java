package com.multicoreware;
import java.util.*;
public class MatrixRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row value and column");
		int n= sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		//int[][] arr2=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		rotateArray(arr, n, m);
		

	}
	public static void rotateArray(int[][] arr, int n, int m)
	{
		int[][] arr2=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr2[j][n-i-1]=arr[i][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
//(0,0)=(0,3)
	//(0,1)=(1,3)
	//(0,2)=(2,3)
	//(0,3)=(3,3)
	// another approach without using the extra spece is 
	//first transpose the matrix and then reverse every row
	//Transpose of the matrix approach
	//----------------------------------------------------
	// The diagonal elements of a matrix remains whereever there are
	//the elements above the diagonal will replace the elements 
	//below the diagonal
	//the logic is
//	for(int i=0;i<n-1;i++)
//	{
//		for(int j=i+1;j<n;j++)
//		{
//			swap(mat[i][j], mat[j][i]);
//		}
//	}
//	for(int i=0;i<n;i++)
//	{
//		reverse every row;
//	}
}
