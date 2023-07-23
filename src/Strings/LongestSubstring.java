package Strings;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String s = "abcccadacbs";
		
		// 
		String max = ""; 
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i; j<s.length(); j++)
			{
				String b = AllTheSubstrings(s,i, j);
				boolean result = checkString(b);
				
				if(result)
				{
					if(b.length()>max.length())
						max = b;
				}
			}
		}
		System.out.println(max);

	}

	private static boolean checkString(String b) {
		for(int i=0; i<b.length(); i++)
		{
			for(int j=0; j<i; j++)
			{
				if(b.charAt(i)==b.charAt(j))
					return false;
			}
		}
		return true;
	}

	private static String AllTheSubstrings(String s, int i, int j) {
		String a ="";
		for(int k=i; k<=j; k++)
		{
			a = a+s.charAt(k);
		}
		return a;
	}

}
