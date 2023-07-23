package Strings;

public class Stringg2 {

	// Convert String to Array..
	
	// toCharArray Method
	public static void main(String[] args) {
		
		String s = "Pune";
		
		char []a = s.toCharArray();
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Following is the another way");
		
	
		// Another way to convert String to Array
		String m = "Pune";
		
		char[] ca = new char[m.length()];
		
		for(int i=0; i<m.length(); i++)
		{
			ca[i] = m.charAt(i);
		}
		
		for(int i=0; i<ca.length; i++)
		{
			System.out.println(ca[i]);
		}

	}

}
