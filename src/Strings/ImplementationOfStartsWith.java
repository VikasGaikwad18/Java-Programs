package Strings;

public class ImplementationOfStartsWith {

	public static void main(String[] args) {
		
		String s1 = "acdefe";
		
		String s2 = "acde";
		
		boolean rs = s1.startsWith(s2);
		System.out.println(rs);
		
		 boolean result  = myMethod(s1, s2);
		 System.out.println(result);
		 

	}

	private static boolean myMethod(String s1, String s2) {
		if(s2.length()<=s1.length())
		{
			int cnt =0;
			for(int i=0; i<s2.length(); i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					cnt++;
				
			}
			if(cnt==s2.length())
				return true;
			else
				return false;
			
		}
		return false;
	}

}
