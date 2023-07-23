package apurva;

import java.util.Scanner;

public class string_reverse {

	public static void main(String args[])
	{
	int a[]= {1,8,1,6,3,8,2,3,2,4};
	
	for(int i=0;i<a.length;i++)
	{
		int cnt=0;
		for(int j=0;j<a.length;j++)
		{
		if(a[i]==a[j])
			cnt++;
		}
		if(cnt==1)
			System.out.println(a[i]+" ");
	}
	}
}
