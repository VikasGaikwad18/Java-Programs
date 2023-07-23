package Arrays;

import java.util.Arrays;

public class MaximumSumOfArr {

	public static void main(String[] args) 
	{
		int[] a = {100,2,3,23};
		
		Arrays.sort(a);
		
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+(a[i]*i);
		}
		if(sum>max)
			max = sum;
		
		System.out.println(max);

	}

}
