package Collection;

public class Variation {

	public static void main(String[] args) {
		
		int start = 1;
		int end = 30;
		
		if(start==1)
			start +=1;
		int cnt1=0;
		int [] b=new int[cnt1];
		int index=0;
		for(int i=start; i<end; i++)
		{
			int cnt =0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==0)
			{
				cnt1++;
			}
			if(cnt==0)
			{
				b[index++]=i;
			}
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
		
		

	}

}
