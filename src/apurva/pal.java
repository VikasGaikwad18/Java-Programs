package apurva;

import java.util.Scanner;

public class pal {
	public static void main(String args[])
	{
	Scanner ac=new Scanner(System.in);
	System.out.println("Eneter string: ");
	String s1=ac.nextLine();
	
	int length=s1.length();
	String s2="";
	for(int i=length-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	
	if(s1==s2)
	{
		System.out.println("palin");
	}
	else
	{
		System.out.println("not");
	}
	
	}

}
