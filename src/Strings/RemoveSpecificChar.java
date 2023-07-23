package Strings;

public class RemoveSpecificChar {

	public static void main(String[] args) {
		
		String s = "abcdphijkpmnop";
		
		String[] sa = s.split("p");
		
		String s2 = "";
		
		for(int i=0; i<sa.length; i++)
		{
			s2 = s2+sa[i];
			
		}
		System.out.println(s2);
		
		
		
		// Another way
		String s3 = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) != 'p')
				s3 = s3+s.charAt(i);
		}
		System.out.println(s3);

	}

}
