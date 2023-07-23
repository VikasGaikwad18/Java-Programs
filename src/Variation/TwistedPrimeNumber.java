package Variation;

public class TwistedPrimeNumber {

	public static void main(String[] args) {
		
		int num = 17;
		
		if(isPrime(num))
		{
			
			int num2 = reverseDigit(num);
			if(isPrime(num2))
				System.out.println("true");
			else
				System.out.println("false");
		}
		else
			System.out.println("false");
		
	}

	private static int reverseDigit(int num) 
	{
		int sum =0;
		while(num>0)
		{
			int ld = num%10;
			sum = sum*10+ld;
			
			num = num/10;
		}
		return sum;
	}

	private static boolean isPrime(int num) {
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
		
	}
}
