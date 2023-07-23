package apurva;

import java.util.Scanner;

public class prime {
	
	public  static void main(String args[])
	{
		Scanner ac=new Scanner(System.in);
		System.out.println("enter range");
		int n=ac.nextInt();
		int count=1;
		for(int i=2;count<=n;i++)
		{
			int j;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				break;
			}
			if(j==i)
			{
				count++;
				System.out.println(i);
			}
		}
		
		
	}

}
