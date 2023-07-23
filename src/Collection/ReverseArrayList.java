package Collection;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		int[] a = {10,2,-2,-20,10};
		int givenSum =-10;
		
		int cnt =0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				int sum =0;
				ArrayList<Integer> al = new ArrayList<Integer>();
				for(int k=i; k<=j; k++)
				{
					al.add(a[k]);
					sum= sum+a[k];
				}
				if(sum==givenSum)
					{
					cnt++;
					System.out.println(al);
					}
			}
		}
		System.out.println(cnt);

	}

}
