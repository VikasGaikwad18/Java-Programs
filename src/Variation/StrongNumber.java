package Variation;

public class StrongNumber {

	public static void main(String[] args) {
		
		int num = 145;
		int on = num;
		int cnt =0;
		int sum = 0;
		while(num>0)
		{
			int lastdigit = num%10;
			cnt = lastdigit;
			int fact =1;
			
			for(int i=1; i<=cnt; i++)
			{
				fact = fact*i;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(sum==on)
			System.out.println("yes");
		else
		System.out.println("no");

	}

}
