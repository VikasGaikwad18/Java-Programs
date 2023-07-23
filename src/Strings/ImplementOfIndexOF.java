package Strings;

public class ImplementOfIndexOF {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "c";
		
		int indx = s1.indexOf(s2);
		System.out.println(indx);
		
		int ans = myIndex(s1,s2);
		System.out.println(ans);
	}

	private static int myIndex(String s1, String s2) {
		if(s2.length()==0)
			return 0;
		
		for(int i=0; i<=s1.length()-s2.length(); i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j =  i;
				int k =0;
				int cnt =0;
				while(j<s1.length()&& k<s2.length())
				{
					if(s1.charAt(j)==s2.charAt(k))
						cnt++;
					k++;
					j++;
				}
				if(cnt==s2.length())
					return i;
				
			}
			
			
		}
		return -1;
	}

}
