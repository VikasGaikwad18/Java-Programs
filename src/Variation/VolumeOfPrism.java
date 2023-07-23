package Variation;

public class VolumeOfPrism {

	public static void main(String[] args) {
		
		String s = "hello";
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=0; j<s.length(); j++)
			{
				if(j+i<=s.length()-1)
					System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		//System.out.println(s.length()-1);

	}

}
