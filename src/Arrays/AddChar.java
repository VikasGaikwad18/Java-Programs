package Arrays;

public class AddChar {

	public static void main(String[] args) {
		
		char[] s1 = {'a','b' ,'c' , 'd','e','y'};
		
		char[] s2 = {'p' ,'q','r' , 's'};
		
		
		char[] s3 = new char[s1.length+s2.length];
		
		int j=0;
		
		for(int i=0; i<s1.length || i<s2.length; i++)
		{
			if(i<s1.length)
				s3[j++] = s1[i];
			
			if(i<s2.length)
				s3[j++] = s2[i];
		}
		print(s3);
		

	}

	private static void print(char[] s3) {
		for(int i=0; i<s3.length; i++)
		{
			System.out.print(s3[i]+" ");
		}
		
	}

}
