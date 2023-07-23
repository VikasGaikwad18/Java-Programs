package Variation;

public class MulProd {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		
		int mid = a.length/2;
		int leftSum =0;
		for(int i=0; i<mid; i++)
		{
			leftSum += a[i];
		}
		int rs = 0;
		for(int j=mid; j<a.length; j++)
		{
			rs+=a[j];
		}
		System.out.println(leftSum*rs);
	}

}
