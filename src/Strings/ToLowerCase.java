package Strings;

public class ToLowerCase {

	public static void main(String[] args) {
		String s = "AbhaAy";
		
		s = MytiLowerCaseMethod(s);
		System.out.println(s);
		
		

	}

	private static String MytiLowerCaseMethod(String s) {
		
		String s2 = "";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				 int num = ch;
			num = num+32;
			ch = (char)num;
			s2+=ch;
			}
			else
				s2+=s2+ch;
		}
		return s2;
	}

}
