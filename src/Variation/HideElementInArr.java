package Variation;

import java.util.Arrays;

public class HideElementInArr {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,6,5};
		
		Arrays.sort(a);
		
		int cnt = a[0];
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]==cnt)
				cnt++;
			else {
				System.out.println(a[i]-1);
			break;
			}
			
			
				
		}
		
	}

}
