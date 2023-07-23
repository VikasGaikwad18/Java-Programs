package Variation;

import java.util.ArrayList;

public class AlterNatePrimeNum {

	public static void main(String[] args) 
	{
		int n = 5;
		int m = 100;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=n; i<=m; i++)
		{
			int cnt =0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==0)
				al.add(i);
		}
		
		for(int i=0; i<al.size(); i++)
		{
			if(i%2==0)
				System.out.print(al.get(i)+" ");
		}



	}

}
