package Variation;

public class sizeOfSubString {

	public static void main(String[] args) {
		
		String s = "11100011110001";
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='1')
			{
				int cnt =0;
				for(int j=i; j<s.length(); j++)
				{
					if(s.charAt(j)=='1')
						cnt++;
					else
						break;
				}
				if(cnt>max)
					max = cnt;
			}
		}
		System.out.println(max);
		
		
		
	}

}
