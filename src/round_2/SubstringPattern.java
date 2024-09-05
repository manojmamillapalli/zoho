package round_2;
import java.util.*;
public class SubstringPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		if(str.length()%2==0)
		{
			System.out.println("please enter odd length string");
		}
		int n=str.length()/2;
		String result="";
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<str.length()-result.length();j++)
			{
			System.out.print(" ");
			}
			result=result+str.substring(n+i, n+i+1);
			System.out.println(result);
	}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length()-result.length();j++)
			{
			System.out.print(" ");
			}
			result=result+str.substring(i, i+1);
			System.out.println(result);
		}

}
}