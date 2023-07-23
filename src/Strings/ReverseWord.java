package Strings;

public class ReverseWord {

	public static void main(String[] args) {
		
		String s = "Pune akola";
		
		char[] a = s.toCharArray();
		
		int i=0;  int j = a.length-1;
		
		while(i<j)
		{
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
		
		s = new String(a);
		System.out.println(s);

	}

}
