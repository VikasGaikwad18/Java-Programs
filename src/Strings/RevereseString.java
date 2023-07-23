package Strings;

public class RevereseString {

	// Last Char comes First nd First char goes last
	public static void main(String[] args) {
		
		String a = "Student are very good ";
		
		String[] sa = a.split(" ");
		
		for(int i=sa.length-1; i>=0; i--)
		{
			System.out.print(sa[i]+" ");
		}

	}

}
