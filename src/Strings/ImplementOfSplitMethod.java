package Strings;

import java.util.Arrays;

public class ImplementOfSplitMethod {

	public static void main(String[] args) {
		
		String s  ="Welcome to Hefshine";
		
		String[] sa = s.split(" ");
		System.out.println(Arrays.toString(sa));
		
		String [] myAns = split(s,' ');
		System.out.println(Arrays.toString(myAns));

	}

	private static String[] split(String s, char c) {
		int cnt =0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				cnt++;
		}
		String[] sa = new String[cnt+1];
		
		String s1 = "";
		int indx = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=c)
				s1 = s1+s.charAt(i);
			else
			{
				sa[indx] = s1;
				indx++;
				s1="";
			}
		}
		sa[indx] = s1;
		return sa;
		
		}

}
