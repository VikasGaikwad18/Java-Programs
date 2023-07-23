package Variation;

public class SumofDigitandNumisGivenNum {

	public static void main(String[] args) {
		
		int n= 21;
		
		
		for(int i=1; i<=n; i++)
		{
			int sum =0;
			int num = i;
			while(num>0)
			{
				int ld = num%10;
			     sum+=ld;
				num = num/10;
			}
			if(sum+i==n)
				System.out.println(i);
			
		}

	}

}
