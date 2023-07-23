package Strings;

public class ImplementationOFEndWith {

	public static void main(String[] args) {
		
		String s1 = "abcdef";
		
		String s2 = "cde";
		
		boolean res = s1.endsWith(s2);
		System.out.println(res);
		
		boolean myans = myMethod(s1,s2);
		System.out.println(myans);

	}

	private static boolean myMethod(String s1, String s2) {
		
		if(s2.length()<=s1.length())
		{
			int cnt =0;
			int s1index = s1.length()-1;
			int s2Index = s2.length()-1;
			while(s2Index>=0)
			{
				if(s1.charAt(s1index)==s2.charAt(s2Index))
					cnt++;
				s1index--;
				s2Index--;
				
				
			}
			if(cnt==s2.length())
				return true;
			else
				return false;
		}
		return false;
	}

}
