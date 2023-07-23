package Variation;

import java.util.ArrayList;

public class PrimeFactors {

	public static void main(String[] args) {
		
		int n = 250;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		while(n>1)
		{
			int i=2;
			while(i<=n)
			{
				if(n%i==0)
				{
					al.add(i);
					n = n/i;
					break;
				}
				i++;
			}
		}
		
		for(int i=0; i<al.size(); i++)
		{
			int cnt =0;
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					cnt++;
			}
			if(cnt==0)
			{
				int cnt2 =0;
				for(int j=0; j<al.size(); j++)
				{
					if(al.get(i)==al.get(j))
						cnt2++;
				}
				System.out.println(al.get(i)+" "+cnt2);
			}
		}

	}

}
