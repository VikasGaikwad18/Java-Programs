package Variation;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num = 370;
		int temp =num;
		int sum = 0;
		while(num>0)
		{
			int ld = num%10;
			int cube = (int)Math.pow(ld,3);
			sum = sum+cube;
			num = num/10;0
		}
		if(sum==temp)
			System.out.println("armStrong Number");
		else
			System.out.println("not ArmStrong number");
		
		

	}

}
