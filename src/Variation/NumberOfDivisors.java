package Variation;

public class NumberOfDivisors {

	public static void main(String[] args) 
	{
		
		int n = 9;
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				if(i%3==0)
					System.out.println(i);
			}
		}
		

	}

}
