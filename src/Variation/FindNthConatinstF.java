package Variation;

import java.util.ArrayList;

public class FindNthConatinstF {

	public static void main(String[] args) 
	{
		
		// Find the numbers contains only 3 & 4;
		int n = 4;
		int cnt =0;
		int i=1;
		while(true)
		{
			int num = i;
			while(num>0)
			{
				int ld = num%10;
				
				if(ld==3 || ld==4)
				{
					num = num/10;
				}
				else
					break;
			}
			if(num==0)
			{
				System.out.println(i);
				cnt++;
			}
			if(cnt==n)
				break;
			i++;
		}
		
		

	}

}
