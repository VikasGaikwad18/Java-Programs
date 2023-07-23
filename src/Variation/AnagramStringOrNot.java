package Variation;

import java.util.TreeMap;

public class AnagramStringOrNot {

	public static void main(String[] args) 
	{
	// frequency of each character of two strings are equal or not
		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		
		TreeMap<Character, Integer> tm1 = new TreeMap<Character, Integer>();
		findFreq(s1, tm1);
		TreeMap<Character, Integer> tm2 = new TreeMap<Character, Integer>();
		findFreq(s2, tm2);
		
		if(tm1.equals(tm2))
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}

	private static void findFreq(String s1, TreeMap<Character, Integer> tm1) {
		
		for(int i=0; i<s1.length(); i++)
			{
			if(tm1.containsKey(s1.charAt(i)))
					{
				int val = tm1.get(s1.charAt(i));
				val++;
				tm1.put(s1.charAt(i),val);
					}
			else {
				tm1.put(s1.charAt(i), 1);
			}
			}
	}

}
