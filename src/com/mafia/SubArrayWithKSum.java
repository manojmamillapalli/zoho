package com.mafia;
import java.util.*;
public class SubArrayWithKSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,9,3,7};
		int n=arr.length;
		int k=10;
		SumWithSubArray(arr,n,k);
	}
	public static void SumWithSubArray(int[] arr, int n, int k)
	{
		 int start = 0, end = -1, sum = 0;
		    while (start < n) {
		      while ((end + 1 < n) && (sum + arr[end + 1] <= k))
		        sum += arr[++end];

		      if (sum == k) {
		        for (int p = start; p <= end; p++)
		          System.out.print(arr[p] + " ");
		        System.out.println();
		      }

		      sum -= arr[start];
		      start++;
		    }
		   
	}

}
