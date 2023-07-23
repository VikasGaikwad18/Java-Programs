package Variation;

public class FirstNonrepeatedCharinString {

	public static void main(String[] args) {
		
		String s = "abcydsabcdyme";
		
		for(int i=0; i<s.length(); i++)
		{
			int cnt =0;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j) && i!=j)
					{
					cnt++;
				break;
					}
				
			}
			if(cnt==0)
			{	
				System.out.println(s.charAt(i));
			break;
			}
		}

	}

}
