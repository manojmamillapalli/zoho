package com.mafia;
import java.util.*;
public class ReplaceMissingNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {-1,-1,6,1,9,3,2,-1,4,-1};
		int n=arr.length;
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=-1)
			{
				list.add(arr[i]);
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(list.contains(i))
			{
				arr[i]=i;
			}
			else
			{
				arr[i]=-1;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
