package Variation;

public class EquilibriumPoint {

	public static void main(String[] args) {
		
		int[] a = {1,3,5,2,2};
		
		// return the index of equilibrium point
		
		for(int i=0; i<a.length; i++)
		{
			int leftSum =0;
			int rightSum =0;
			for(int j=0; j<i; j++)
			{
				leftSum += a[j];
			}
			for(int k=i+1; k<a.length; k++)
			{
				rightSum +=a[k];
			}
			if(leftSum==rightSum) {
				System.out.println(i);
				break;
			}
			
		}
		

	}

}
