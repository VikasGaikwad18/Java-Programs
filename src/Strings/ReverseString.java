package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Pune";
		String s2 = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			s2 = s2+s.charAt(i);
		}
		System.out.println(s2);
		
		
		
		//Second Way
		
		String s3 = "";
		
		for(int i=0; i<s.length(); i++)
		{
			s3 = s.charAt(i)+s3;
		}
		System.out.println(s3);

	}

}
