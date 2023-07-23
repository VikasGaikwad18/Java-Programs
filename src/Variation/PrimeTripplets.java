package Variation;

import java.util.ArrayList;

public class PrimeTripplets {

	public static void main(String[] args) {
		
		int n = 25;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=5; i<n; i++)
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
			for(int j=i+1; j<al.size(); j=j+5)
			{
				for(int k=j+1; k<al.size(); k++)
				{
					System.out.println(al.get(i)+" "+al.get(j)+" "+al.get(k));
					break;
				}
			}
		}
	}

}
