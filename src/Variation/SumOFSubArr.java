package Variation;

import java.util.ArrayList;

public class SumOFSubArr {

	public static void main(String[] args) {
		
		int[] a = {1,4,45,6,0,19};
		
		int x = 51;
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				ArrayList<Integer> al = new ArrayList<>();
				int sum =0;
				for(int k=i; k<=j; k++)
				{
					al.add(a[k]);
					sum +=a[k];
					
				}
				if(sum>x)
				{
					if(al.size()<min)
					{
						min = al.size();
						
					}
				}
			}
			
		}
		System.out.println(min);

	}

}
