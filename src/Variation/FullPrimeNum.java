package Variation;

public class FullPrimeNum {

	public static void main(String[] args) {
		// A NUMBER ITSELF IS PRIME AND ALL OF ITS DIGITS IS ALSO PRIME
		
		int num = 7;
		String m = Integer.toString(num);
	   if(isPrime(num))
		{
			int n = 0;
		while(num>0)
		{
			int lastDigit = num%10;
			if(isPrime(lastDigit))
			 n++;
			num = num/10;
		}
		if(n==m.length())
			System.out.println("yes");
		else
			System.out.println("no");
		}
		else
			System.out.println("no");

	}
	
	private static boolean isPrime(int a) {

		if(a<2)
			return false;
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
				return false;
			
		}
		return true;
	}

}
