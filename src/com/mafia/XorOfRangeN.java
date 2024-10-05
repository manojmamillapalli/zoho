package com.mafia;
import java.util.*;
public class XorOfRangeN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		int xor=xorfunction(n);
        System.out.println(xor);
        for(int i=1;i<=n;i++)
        {
        	x=x^i;
        }
        System.out.println(x);
	}
	public static int xorfunction(int n)
	{
		if(n%4==1)
		return 1;
		else if(n%4==2)
		{
			return n+1;
		}
		else if(n%4==3)
		{
			return 0;
		}
		else if(n%4==0)
		{
			return n;
		}
		return -1;
		
	}

}
