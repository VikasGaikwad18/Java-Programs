package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SmallerElementinArr {

	public static void main(String[] args) {
		
		int[] a = {4,8,5,2,25};
		
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[i])
				{
					System.out.println(a[i]+" "+a[j]);
					cnt++;
					break;
				}
			}
			if(cnt==0)
				System.out.println(a[i]+" "+-1);
		}
		
	}

}
