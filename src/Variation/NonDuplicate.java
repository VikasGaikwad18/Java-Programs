package Variation;

public class NonDuplicate {

	public static void main(String[] args) 
	{
		int[] a = {1,1,1,2,3,4,5,8,5,6,3,5,6};
		
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])//&& i!= j)
					cnt++;
			}
			
			if(cnt==1)
				System.out.print(a[i]+" ");
		}
		

	}

}
