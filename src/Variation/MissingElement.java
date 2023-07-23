package Variation;

import java.util.HashMap;

public class MissingElement {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap <Integer,String>
		
		
		// Find the Missing Element in the Given Array
		int[] a = {6,1,2,8,3,4,7,10,5};
		int n = 10;
		int sum =0;
		for(int i=0; i<a.length; i++)
			sum+=a[i];
		
		int sum2 =0;
		for(int j=0; j<=n; j++)
		{
			sum2+=j;
		}
		
		System.out.println(sum2-sum);
		
		

	}

}
