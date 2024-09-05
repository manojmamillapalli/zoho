package com.mafia;
import java.util.*;
public class AnagramCountInArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr= {"cat", "god","dog","dog","tac", "dog","act", "act"," "," "};
		ArrayList<Integer> list=new ArrayList<>();
		//boolean visited=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!="null")
			{
			int count=0;
			char[] ch=arr[i].toCharArray();
			for(int j=0;j<arr.length;j++)
			{
				char[] ch1=arr[j].toCharArray();
				if(anagram( ch,  ch1))
				{
					count++;
					arr[j]="null";
				}
				
			}
			
			list.add(count);
			}
			else 
				continue;
		}
		Collections.sort(list);
		System.out.println(list);

	}
	public static boolean anagram(char[] ch, char[] ch1)
	{
		int xor1=0;
		int xor2=0;
		for(int i=0;i<ch.length;i++)
		{
			xor1=xor1^ch[i];
		}
		for(int i=0;i<ch1.length;i++)
		{
			xor2=xor2^ch1[i];
		}
		int result=xor1^xor2;
		if(result==0)
		{
			return true;
		}
		
		return false;
		
	}

}
