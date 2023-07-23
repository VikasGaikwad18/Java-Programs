package Arrays;

public class LeaderElement {

	public static void main(String[] args) {
		
		int [] a = {2,12,111,34,56,99,8,45,99};
		
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]>a[i])
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}
		
		

	}

}
