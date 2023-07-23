package Strings;

public class ReverseStatement {

	public static void main(String[] args) {
		
		String s = "You All are very very very good students";
		
		String[] a = s.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			String m = a[i];
			String s1 = "";
			for(int j=m.length()-1; j>=0; j--)
			{
				s1 = s1+m.charAt(j);
			}
			a[i] = s1;
			System.out.print(a[i]+" ");
		}

	}

}
