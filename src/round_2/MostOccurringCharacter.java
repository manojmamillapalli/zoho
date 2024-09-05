package round_2;

public class MostOccurringCharacter {
   public static void main(String[] args)
   {
	   mostoccurring("mifsisoof");
   }
   public static void mostoccurring(String str)
   {
	   char[] ch=str.toCharArray();
	   int max=0;
	   int max1=0;
	   char mostFrequentChar = '\0';
	   for(int i=0;i<ch.length;i++)
	   {
		   int count=0;
		   int k=0;
		   for(int j=0;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j])
			   {
				   count++;
				   if(count>max)
				   {
					   max=count;
					   max1=j;
					   mostFrequentChar=ch[i];
					   
				   }
				   else if (count == max && j<max1) {
					   max1=j;
					   mostFrequentChar= ch[j];
		           }
			   }
		   }
	   }
	   System.out.println(mostFrequentChar);
	  
   }
}
