package Variation;
import java.util.*;

public class ArrangeArryElements {

	public static void main(String[] args) {
		
		int[] a = {1,9,2,8,3,7,4,6,5};
		
		Arrays.sort(a);
		
		int i=0; int j = a.length-1;
		int[] b = new int[a.length];
		int indx =0;
		
		while(i<j)
		{
			b[indx++] = a[i];
			b[indx++] = a[j];
			
			i++;
			j--;
	}
		if(i==j)
			b[indx]= a[i];
		for(int k=0; k<b.length; k++)
			System.out.print(b[k]+" ");

	}

}
