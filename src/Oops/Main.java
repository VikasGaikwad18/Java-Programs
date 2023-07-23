package Oops;

import java.util.*;

public class Main {
	
	static String s ="";

	public static void main(String[] args) 
	{
		
		int T = 9;
		int[] a = {2,5,4,22};
		Arrays.sort(a);
		ArrayList<Integer> al  = new ArrayList<>();	
		int cnt =0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==T)
			{
				System.out.println(i);
				cnt++;
				break;
			}
			else
			{
				al.add(a[i]);
				
			}
		}
		if(cnt==0)
		{
			al.add(T);
			Collections.sort(al);
			for(int i=0; i<al.size(); i++)
			{
				if(al.get(i)==T)
					System.out.println(i);
			}
		}
		
	}

}
