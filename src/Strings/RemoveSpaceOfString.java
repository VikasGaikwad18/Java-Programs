package Strings;

public class RemoveSpaceOfString {

	public static void main(String[] args) {
		
		String s = "   You       all    are very good   Students   ";
         
		
		s = myTrim1method(s);
		
		String s2 = "";
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
		{}
		else
			s2 =s2+s.charAt(i);
	}
	System.out.println(s2);
	}

	private static String myTrim1method(String s) {
		int i =0;
		
		while(true)
		{
			if(s.charAt(i)==' ')
				i++;
			else
				break;
		}
		int j= s.length()-1;
		while(true)
		{	
			if(s.charAt(j)==' ')
				j--;
			else
				break;
		}
		String s2 = "";
		for(int k=i; k<=j; k++)
		{
			s2 = s2+s.charAt(k);
		}
		return s2;
	}

}
