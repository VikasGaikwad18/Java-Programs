package Variation;

public class MakingElementDistinct {

	public static void main(String[] args) {
		
		int[] a = {1,1,3,5,6};
		int sum =0;
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt!=0)
				a[i] = a[i]+1;
			
			sum = sum+a[i];
		}
		System.out.println(sum);
		

	}

}
