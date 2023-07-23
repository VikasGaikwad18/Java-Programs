package Strings;

public class SortString {

	public static void main(String[] args) {
		
		String s = "43521";
		System.out.println(s);
		
		char[] ca = s.toCharArray();
		
		for(int i=0; i<ca.length; i++)
		{
			for(int j=i+1; j<ca.length; j++)
			{
				if(ca[i]>ca[j])
				{
					char temp = ca[i];
					ca[i] = ca[j];
					ca[j] = temp;
				}
			}
		}
		s = new String(ca);
		System.out.println(s);

	}

}
