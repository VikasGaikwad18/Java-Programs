package Variation;

import java.util.ArrayList;

public class MoveAllZeroEnd {

	public static void main(String[] args) 
	{
		int[] a= {0,1,3,0,2,5,0,-5,-8,9,0};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] !=0)
				al.add(a[i]);
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
				al.add(a[i]);
		}
		System.out.println(al);

	}

}
