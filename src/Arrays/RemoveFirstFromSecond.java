package Arrays;

import java.util.Arrays;

public class RemoveFirstFromSecond {

	public static void main(String[] args) {
		
		int[] a = {1,1,1,1,1,2,2,3,4};
		
		int[] b = {1,2,4};
		
		
		
		for(int i=0; i<b.length; i++)
		{
			int cnt =0;
			for(int j=0; j<a.length; j++)
			{
				if(b[i]==a[j])
					cnt++;
				if(cnt==2)
					break;
			}
			int[] temp = new int[a.length-cnt];
			int indx =0;
			int cnt2 =0;
			for(int j=0; j<a.length; j++)
			{
				if(b[i]==a[j] && cnt2<2)
					cnt2++;
				else if(b[i] != a[j] || cnt2>=2)
					temp[indx++] = a[j];
			}
			a = temp;
			
		}
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println(Arrays.toString(a));
		
		
		
			

	}

}
