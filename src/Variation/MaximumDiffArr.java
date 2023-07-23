package Variation;

public class MaximumDiffArr {

	public static void main(String[] args) {
		int[] a = {3,2,1,2,1,4,5,8,6,7,4,2};
		
		int max =Integer.MIN_VALUE;
		int m = 0;
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
					m = j-i;
				
				if(m>max)
					max = m;
			}
			
		}
		
		System.out.println(max);
	}

}
