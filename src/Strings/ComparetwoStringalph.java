package Strings;

public class ComparetwoStringalph {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "abCd";
		
		int num = s1.compareTo(s2);
		int num2 = MyCompareToMethod(s1,s2);
		
		System.out.println(num+" "+num2);

	}

	private static int MyCompareToMethod(String s, String s2) {
		
		int length = 0;
		if(s.length()<s2.length())
			length = s.length();
		else
			length = s2.length();
		
		for(int i=0; i<length; i++)
		{
			char ch1 = s.charAt(i);
			char ch2 = s2.charAt(i);
			if(ch1 != ch2)
				return ch1-ch2;
		}
		return s.length()-s2.length();
	}

}
