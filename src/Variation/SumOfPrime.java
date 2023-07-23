package Variation;

import java.util.ArrayList;

public class SumOfPrime {

	public static void main(String[] args) {
		
		int num = 34;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2; i<=num; i++)
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
				for(int j=i; j<al.size(); j++)
				{
					if(al.get(i)+al.get(j)==num)
						System.out.println(num+"="+al.get(i)+"+"+al.get(j));
				}
			}
	}

}
