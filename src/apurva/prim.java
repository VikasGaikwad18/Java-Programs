package apurva;

import java.util.Scanner;

public class prim {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr string: ");
	String s1=sc.nextLine();
	
	int length=s1.length()-1;
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	int j;
	for(j=0;j<length;j++)
	{
		if(s2.charAt(j)!=s1.charAt(j))
			break;
	}
	
	if(j==length)
	{
	System.out.println("yes");	
	}
	else
		System.out.println("n");
}
}
