package Arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int [] a= {11,54,66,89,50,59,97};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		
		int ei = 0;     // ei is the initial index of even number
		int oi= 0;       // oi is the initial index of odd number
		
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				even[ei]=a[i];
				ei++;
			}else 
			{
				odd[oi]=a[i];
				oi++;
				
			}
		}
		for(int i=0; i<even.length; i++)
		{
			System.out.print(even[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<odd.length; i++)
		{
			System.out.print(odd[i]+" ");
		}
		System.out.println();

	}

}
