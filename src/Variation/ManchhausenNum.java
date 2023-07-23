package Variation;

public class ManchhausenNum {

	public static void main(String[] args) {
		
		int n = 5000000;
		//int originalNum = n;
		
		for(int i=1; i<n; i++)
		{
		int sum =0;
		int n2 = i;
		while(n2>0)
		{
			int ld= n2%10;
			sum += (int) Math.pow(ld, ld); 
			n2= n2/10;
		}
		if(sum==i)
			System.out.println(i);
		}
		
	}

	
}
