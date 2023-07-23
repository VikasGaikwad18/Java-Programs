package Strings;

import java.util.Arrays;

public class CompareToMethod1702 {

	public static void main(String[] args) {
		
		String[] a = {"welcome","to","java","hefshine"};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				int diff = myCompareto(a[i],a[j]);
				if(diff<0)
				{
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					
			}
		}
		System.out.println(Arrays.toString(a));

	}

	private static int myCompareto(String a, String b) {
		for(int i=0; i<a.length() && i<b.length(); i++)
		{
			if(a.charAt(i) != b.charAt(i))
				return a.charAt(i)-b.charAt(i);
		}
		return a.length()-b.length();
	}
	

}
