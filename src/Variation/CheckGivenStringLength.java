package Variation;

public class CheckGivenStringLength {

	public static void main(String[] args) 
	{
		
		String s = "geeks50";
		
		String m = "";
		int s3 = 0;
		int cnt = 0;
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				m =s.charAt(i)+m;
				cnt++;
			}
			else
				break;
		}
		s3 = Integer.parseInt(m);
		int k = s.length()-cnt;
		if(k==s3)
			System.out.println("1");
		else
			System.out.println("no");
		
		

	}

	

}
