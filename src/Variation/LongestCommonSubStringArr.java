 package Variation;

public class LongestCommonSubStringArr {

	public static void main(String[] args) {
		
		String[] a = {"geeksforgeeks","geeks","geek","geezer"};
		
		String temp = a[0];
		
		String s1 = "";
		
		for(int i=0; i<temp.length(); i++)
		{
			int cnt =0;
			for(int j=0; j<a.length; j++)
			{
				if(temp.charAt(i)==a[j].charAt(j))
					cnt++;
			}
			if(cnt==a.length)
				s1 += temp.charAt(i);
			
		}
		System.out.println(s1);
	}

}
