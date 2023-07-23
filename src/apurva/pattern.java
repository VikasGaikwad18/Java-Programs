package apurva;

import java.util.Scanner;

public class pattern {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr Input: ");
	int n=sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(j-i<=0)
			{
				if(i%2==0)
				{
					System.out.print("* ");
				}
				else
					System.out.print("@ ");
			}
		}
		System.out.println();
	}
			
}
}
