package Strings;

public class SortStringByAlphabetically {

	public static void main(String[] args) {
		
		String[] s = {"latur","baramati","washim","Akola","pune","nashik","nagar"};
         
		for(int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String m:s)
		System.out.println(m);
		
	}

}
