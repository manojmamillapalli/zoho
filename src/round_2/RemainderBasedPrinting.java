package round_2;
import java.util.*;
public class RemainderBasedPrinting {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int one=1;
int two=1;
String result="";
if(n>26)
{  
	int rem=n%26;
	if(rem>9)
	{
		one=rem/10;
		two=rem%10;
	}
	n=rem;
	result += String.valueOf((char)(65+one-1)).repeat(one)+String.valueOf((char)(65+n-1)).repeat(two);
	System.out.println(result);
}
else
System.out.println((char)(65+n-1));



	}

}
