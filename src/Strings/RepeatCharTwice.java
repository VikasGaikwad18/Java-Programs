package Strings;


// ASS 7 = Repeat each of char Twice in Given String//
public class RepeatCharTwice {

	public static void main(String[] args) {
		
		String s2 = "Vikas";
		
		String s3 ="";
		
		for(int i=0; i<s2.length(); i++)
		{
			char ch = s2.charAt(i);
			s3 = s3+ch+ch;
		}
		System.out.println(s3);
		

	}

}
