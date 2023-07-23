package Strings;

public class SumOfDigit {

	public static void main(String[] args) {
		
		String s = "1234abc";
		
		int sum = sumOfDigits(s);
		
		System.out.println(sum);

	}

	private static int sumOfDigits(String s) {
		int sum =0;
		for(int i=0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch<='9' && ch>='0')
			{
				sum = sum+(ch-48);
			}
		}
		return sum;
		
	}

}
