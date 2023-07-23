package Strings;

public class CompareToMethod {

	public static void main(String[] args) {
		// Based on ASCII values
		String s1 = "abcd";
		String s2 = "abcde";
		
		
		int result = s1.compareTo(s2);
		
		System.out.println(result);
		
		
		
		// Firstly convert all letters to lowerCase
		String a = "PuNe";
		String b = "pune";
		
		int ans = a.compareToIgnoreCase(b);
		
		System.out.println(ans);

	}

}
