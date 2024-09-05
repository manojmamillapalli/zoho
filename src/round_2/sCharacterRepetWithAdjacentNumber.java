package round_2;
import java.util.*;
public class sCharacterRepetWithAdjacentNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to perform :");
		String str=sc.nextLine();
		String result="";
		char[] ch= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&& ch[i]<='Z'|| ch[i]>='a'&& ch[i]<='z')
			{
				int rep=numberOfTimes(str, i);
				result += String.valueOf(ch[i]).repeat(rep > 0 ? rep : 1);

			}
		}
		System.out.println(result);

	}
	public static int numberOfTimes(String str, int i)
	{
		int result=0;
		while(i+1<str.length())
		{
			if(str.charAt(i+1)>='0' && str.charAt(i+1)<='9')
			{
				int num=str.charAt(i+1)-'0';
				result=result*10+num;
		}
			else
				break;
			i=i+1;
		}
		return result;
		
	}

}
