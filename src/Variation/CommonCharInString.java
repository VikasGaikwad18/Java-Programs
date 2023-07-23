package Variation;

import java.util.*;

public class CommonCharInString {

	public static void main(String[] args) 
	{
		
		String a = "geeksforabcd";
		String b =  "geeksdefghi";
		
		TreeSet<Character> ts = new TreeSet<Character>();
		
		for(int i=0; i<a.length(); i++)
		{
			if(!b.contains(a.charAt(i)+""))
				ts.add(a.charAt(i));
		}
		for(int j=0; j<b.length(); j++)
		{
			if(!a.contains(b.charAt(j)+""))
				ts.add(b.charAt(j));
		}
		
		System.out.println(ts);
		
	}

}
