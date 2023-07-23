package Strings;

public class FrequencyofChar {

	public static void main(String[] args) 
	{
		String m = "vikasss";
		
		for(int i=0; i<m.length(); i++)
		{
			int cnt =0;
			for(int j=i+1; j<m.length(); j++)
			{
				if(m.charAt(i)==m.charAt(j))
					cnt++;
			}
			if(cnt==0)
			{
				int cnt2 =0;
				for(int j=0; j<m.length(); j++)
				{
					if(m.charAt(i)==m.charAt(j))
                     cnt2++;
				}
				System.out.println(cnt2+" "+m.charAt(i));
	

				}
			}
		}
		

	}


