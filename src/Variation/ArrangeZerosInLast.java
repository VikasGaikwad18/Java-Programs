package Variation;

public class ArrangeZerosInLast {

	public static void main(String[] args) 
	{
		
		int[] a = {1,4,5,7,0,5,0,3,0,0,2};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==0)
				{
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		

	}

}
