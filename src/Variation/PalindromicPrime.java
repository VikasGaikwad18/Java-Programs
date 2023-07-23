package Variation;

public class PalindromicPrime {

	public static void main(String[] args) {
		
		int n = 500;
		
		// Palindromic Prime  Between Given Range
		for(int i=2; i<n; i++)
		{
			int cnt = 0;
			for(int j= 2; j<i; j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==0)
			{
				int num = i;
				int cnt2 =0;
				while(num>0)
				{
					int ld = num%10;
					cnt2 = cnt2*10+ld;
					num=num/10;
				}
				if(i==cnt2)
					System.out.print(cnt2+" ");
			}
		}

	}

}
