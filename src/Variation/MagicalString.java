package Variation;

public class MagicalString {

	public static void main(String[] args) {
		String s = "erpzhbvwbzyslpzxsz";
		
		String s1 = "";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z')
			{
			 ch = (char) (219-s.charAt(i));
			s1 += ch;
			}
			else
			{
				ch = (char)(155-s.charAt(i));
			s1 +=ch;
			}
			
		}
		System.out.print(s1);

	}

}
