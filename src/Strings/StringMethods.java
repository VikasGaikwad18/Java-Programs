package Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String a = "Pune";
		String b = "Pune";
		
		if(a.equals(b))
			System.out.println("same");
		else
			System.out.println("not same");
		
		
		// NEW Strings
		
		String s1 = "HefshineSoftwarePvtLtdPune";
		
		String s2 = "Pune";
		
		String s3 = s1+s2;  // Addition of two Strings
		System.out.println(s3);
		
		boolean r1 = s1.startsWith(s2); 
		 
		System.out.println(r1);
		
		boolean r2 = s1.endsWith(s2);
		System.out.println(r2);
		
		
		boolean r3 = s1.contains(s2);
		System.out.println(r3);
		
		
		
		String m = "Pune";
		
		m = m.toLowerCase();
		System.out.println(m);
		
		m = m.toUpperCase();
		System.out.println(m);
		
		String A = m.replace('E', 'a');
		System.out.println(A);

	}

}
