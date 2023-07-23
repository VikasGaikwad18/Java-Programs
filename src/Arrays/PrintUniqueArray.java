package Arrays;

public class PrintUniqueArray {

	public static void main(String[] args) {
		
		int [] a = {11,22,33,44,55,55,66,66,11};
		
		int uniqcnt =0;
		
		for(int i=0; i<a.length; i++)
		{
			int cnt = 0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				uniqcnt++;
		}
			System.out.println("uniqe Count length of array is : "+uniqcnt);
		
		
		
		int[] b = new int[uniqcnt];
		int uniqueIndex = 0;
		
		for(int i=0; i<a.length; i++)
		{
			int cnt2 = 0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt2++;
			}
			if(cnt2==0)
				b[uniqueIndex++] = a[i];
		}
		for(int i=0; i<b.length; i++)
		{
		System.out.print(b[i]+" ");
		}
		

	}

}
