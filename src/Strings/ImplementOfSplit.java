package Strings;

public class ImplementOfSplit {

	public static void main(String[] args) {
		
		String s = "Hefshine Softaware Pune Pvt limited ";
		
		
		String s1 = "";
		
		int spaceCount= giveMeSpaceCount(s);
		String[] a = new String[spaceCount];
		int indx = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				a[indx++] = s;
				s1="";
			}
			else
				s1= s1+s.charAt(i);
		}
		System.out.println(s1);
	}
	private static int giveMeSpaceCount(String s) {
		int spaceCount = 0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				spaceCount++;
		}
		return spaceCount;
	}

}
