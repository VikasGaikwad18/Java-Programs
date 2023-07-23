package Variation;

public class CountNumberOfString {

	public static void main(String[] args) {
		
		String s = "12 , abcd345 , 890 bgf";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				String m = "";
				int j=i;
				for(; j<s.length(); j++)
				{
					if(s.charAt(j)>='0' && s.charAt(j)<='9')
					m = m+s.charAt(j);
					else
						break;
				}
				i=j;
				
				if(m.length()>0)
				{
					int num = Integer.parseInt(m);
					
					System.out.println(num);
				}
			}
		}

	}

}
