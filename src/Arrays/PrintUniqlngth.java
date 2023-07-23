package Arrays;

public class PrintUniqlngth {

	public static void main(String[] args) {
		
		int [] a = {11,22,33,44,11,22,33,55};
		
		int uniqcnt = 0;
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				break;
				}
			}
			if(cnt==0)
				uniqcnt++;
		}
		System.out.println(uniqcnt);
		

	}

}
