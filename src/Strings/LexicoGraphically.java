package Strings;

public class LexicoGraphically {

	public static void main(String[] args) {
		
		String a = "abcd";
		String b = "abc";
		
		int res = myCompareMethod(a, b);
		System.out.println(res);
	}

	private static int myCompareMethod(String a, String b) {
		int len = -1;
		
		if(a.length()<b.length())
			len = a.length();
		else
			len = b.length();
		
		for(int i=0; i<len; i++) {
			if(a.charAt(i) != b.charAt(i) )
				return a.charAt(i)-b.charAt(i);
		}
	
	return a.length()-b.length();

	}
}
