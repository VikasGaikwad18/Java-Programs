package SetInJava;

import java.util.*;

public class AddLastElemntsinSet {

	public static void main(String[] args) {

		String m = "abcdaabcda";
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0; i<m.length(); i++)
		{
			if(map.containsKey(m.charAt(i)))
			{
				int value = map.get(m.charAt(i));
				map.put(m.charAt(i), ++value);
			}
			else
				map.put(m.charAt(i), 1);
			
		}
			
	}
}
		