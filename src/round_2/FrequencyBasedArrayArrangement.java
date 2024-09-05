package round_2;

public class FrequencyBasedArrayArrangement {

	public static void main(String[] args) {
		int[] arr= {1,2,4,2,5,2,2,6,5,1,5,1};
		int n=arr.length;
		int[] elements=new int[n];
		int[] count=new int[n];
		int Uniquecount=0;
		for(int i=0;i<n;i++)
		{
			boolean visited=false;
			for(int j=0;j<Uniquecount;j++)
			{
				if(arr[i]==elements[j])
				{
					count[j]++;
					visited=true;
					break;	
				}
			}
			if(!visited)
			{
				elements[Uniquecount]=arr[i];
				count[Uniquecount]=1;
				Uniquecount++;
			}
		}
		 System.out.println();
		 for (int i = 0; i < Uniquecount-1 ; i++) {
	            for (int j = i + 1; j < Uniquecount; j++) {
	                if (count[i] < count[j] || (count[i] == count[j] && elements[i] > elements[j])) {
	                    // Swap counts
	                    int tempCount = count[i];
	                    count[i] = count[j];
	                    count[j] = tempCount;

	                    // Swap elements
	                    int tempElement = elements[i];
	                    elements[i] = elements[j];
	                    elements[j] = tempElement;
	                }
	            }
	            
	        }
		 for (int i = 0; i < Uniquecount; i++) {
             for (int j = 0; j < count[i]; j++) {
                 System.out.print(elements[i] + " ");
             }
         }

	}
	

}
