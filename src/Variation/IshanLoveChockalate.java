package Variation;

import java.util.ArrayList;

public class IshanLoveChockalate {

	public static void main(String[] args) 
	{
		
		int[] a = {5,3,6,9,11,1,0};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		
		
		for(int j=0; j<=1; j++)
		{
		
		for(int i=0; i<al.size(); i++)
		{
			
			if(al.get(0)>al.get(al.size()-1))
			{
				al.remove(0);
			}
			else
				al.remove(al.size()-1);
			
			
		}
		}
		System.out.println(al);
		

	}

}
