package com.mafia;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,2,1,3};
		int ans=missingNumber(arr);
		System.out.println(ans);
		int n=1;
        System.out.println((3>>(n-1)&1));
	}
public static int missingNumber(int[] arr)
{
	int xor=0;
	for(int i=0;i<arr.length;i++)
	{
		xor^=arr[i];
	}
	return xor;
}
}
