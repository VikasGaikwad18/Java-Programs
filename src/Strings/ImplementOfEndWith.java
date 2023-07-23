package Strings;

public class ImplementOfEndWith {

	public static void main(String[] args) {
		
		String s = "HEfShines";
		String s1 = "nese";
		
		boolean result = s.endsWith(s1);
		System.out.println(result);
		
		boolean result1 = myEndsWith(s,s1);
		System.out.println(result1);

	}

	private static boolean myEndsWith(String s, String s1) {
		if(s.length()<s1.length())
			return false;
		
		int i= s.length()-1;
		int j= s1.length()-1;
		while(j>=0)
		{
			if(s.charAt(i) != s1.charAt(j))
				return false;
			i--;
			j--;
		}
		return true;
	}

}
