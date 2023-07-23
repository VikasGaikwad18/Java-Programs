package Strings; 


// Different ways  to create String
public class String1stClass {

	public static void main(String[] args) {
		
		String s1 = "Pune";
		String s2 = new String("Pune");
		
		char []a = {'H','E','f','s','h','i','n','e'};
				
				String b = new String(a);
				System.out.println(a);
				
				for(int i=0; i<s2.length(); i++)
				{
					System.out.println(s2.charAt(i));
				}
				for(int i=0; i<b.length(); i++)
				{
					System.out.println(b.charAt(i));
				}
		}
		

	}


