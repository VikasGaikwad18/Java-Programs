package Strings;

public class SortByLength {

	public static void main(String[] args) {
		
		String[] sa = {"punepunepune","Latur","Aurangabad", "Baramati","Akola"};
		
		for(int i=0; i<sa.length; i++)
		{
			for(int j=i+1; j<sa.length; j++)
			{
				if(sa[i].length()>sa[j].length())
					{
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
						
					}
			}
		}
		for(String s: sa)
			System.out.println(s);

	}

}
