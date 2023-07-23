package Variation;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int sum = 35;
		
		int sum2 =0;
		for(int i=1; i<=sum; i+=2)
		{
			
				sum2+=i;
				if(sum2==sum)
					break;
		}
		if(sum2==sum)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
