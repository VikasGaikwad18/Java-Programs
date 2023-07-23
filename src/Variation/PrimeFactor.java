package Variation;

public class PrimeFactor {

	public static void main(String[] args) 
	{
		int num = 1100;
		
		for(int i=2; i<num; i++)
		{
			int cnt =0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==0 && num%i==0)
				System.out.print(i+" ");
				
		}
		

	}

}
