package Variation;

public class AmicableNum {

	public static void main(String[] args) {
		
		int n = 220;
		// 30 :- 1 2 3 5 6 10 15
		// 52 :- 1 2  10 25
		// 1 2 4 5 8 
		int m = 284;
		
		int sum =0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
				sum +=i;
		}
		
		int sum2 = 0;
		for(int i=1; i<m; i++)
		{
			if(m%i==0)
				sum2 += i;
		}
		if(sum==m && sum2==n)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
