
package Variation;

import java.util.ArrayList;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String s1 = "GeeksforGeeks";
		String  s2 = "GeeksQuiz";
		
		ArrayList<String> al1 = new ArrayList<String>();
		findSubString(s1,al1);
		ArrayList<String>al2 = new ArrayList<String>();
		findSubString(s2,al2);
		
		
		int max = -1;
		String maxStr = "";
		
		for(String data : al1)
		{
			if(al2.contains(data))
			{
				if(data.length()>max)
				{
					max = data.length();
					maxStr= data;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxStr);
	}

	private static void findSubString(String s1, ArrayList<String> al) {
		
		for(int i=0; i<s1.length(); i++)
		{
			for(int j=i; j<s1.length(); j++)
			{
				String temp = "";
				for(int k=i; k<=j; k++)
				{
					temp = temp+s1.charAt(k);
				}
				al.add(temp);
			}
		}
		
		
	}

}
