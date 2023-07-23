package Variation;

public class BalancedArr {

	public static void main(String[] args) {
		
		int[] a = {1,5,3,2};
		
		int mid = a.length/2;
		int leftSum =0;
		for(int i=0; i<mid; i++)
		{
		 leftSum += a[i];
		}
		int rightSum =0;
		for(int j=mid; j<a.length; j++)
		{
			rightSum += a[j];
		}
		int diff = Math.abs(leftSum-rightSum);
		System.out.println(diff);
}}
