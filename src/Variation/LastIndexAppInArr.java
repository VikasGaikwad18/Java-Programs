package Variation;

import java.util.ArrayList;
import java.util.TreeMap;

public class LastIndexAppInArr {

	public static void main(String[] args) 
	{
		
		// Find the Element whose last Appearance is Earliest
		
		int [] a = {10,30,20,10,20};
		
		
		ArrayList<Integer> al = new ArrayList<>();
		al.get(0)
		for(int data : a)
		{
			al.add(data);
		}
		int min = Integer.MAX_VALUE;
		 int ele = Integer.MIN_VALUE;
		 
		 for(int i=0; i<a.length; i++)
		 {
			al.
			 int lastIndex = al.lastIndexOf(al.get(i));
			 if(lastIndex<min)
			 {
				 min = lastIndex;
				 ele = al.get(i);
			 }
				 
		 }
		 System.out.println(ele);

	}

}
