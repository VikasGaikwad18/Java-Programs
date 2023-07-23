package Variation;

public class ContainsDigit {

	public static void main(String[] args) 
	{
		int n =48;
		int m =4;
		int cnt2 =0;
		for(int i=0; i<=n; i++)
		{
			int temp = i;
			while(temp>0)
			{
				int ld = temp%10;
				if(ld==m)
				{
					cnt2++;
					break;
				}
				temp = temp/10;
			}
		}
		System.out.println(cnt2);

	}

}
