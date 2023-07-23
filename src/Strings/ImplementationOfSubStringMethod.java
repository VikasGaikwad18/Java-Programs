package Strings;

public class ImplementationOfSubStringMethod {

	public static void main(String[] args) {
		
		String m = "HefShineSoftwares";
		
		String a = m.substring(2,5);
		
		System.out.println(a);
		
		
		String n = mySubStringMethod(m,2,5);
		System.out.println(n);
	}

	private static String mySubStringMethod(String m, int i, int j) {
		String s = "";
		for(int k=i; k<j; k++)
		{
			s = s+m.charAt(k);
		}
		return s;
	}

}
