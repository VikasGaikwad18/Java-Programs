package Strings;

public class RverseAllCharOfString {

	public static void main(String[] args) {
		
		String s = "You all are very good Students";
		
		String [] sa = s.split(" ");
		
		for(int i=0; i<sa.length; i++)
		{
			String so = sa[i];
			String sr = "";
			
			for(int j=0; j<so.length(); j++)
				sr= so.charAt(j)+sr;
			sa[i] = sr;
		}
		for(int i=0; i<sa.length; i++)
			System.out.print(sa[i]+" ");

	}

}
