package round_2;
import java.util.*;
public class StringPattern {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
String str="ZOHOCORPORATION";
int n=str.length();
char[] ch=str.toCharArray();
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i==j || i+j==n-1)
		{
			System.out.print(ch[i]);
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
