package Strings;

public class DuplicateWordInString {

	public static void main(String[] args) {
		
		String s1 = "Big black bug bit a big black dog on his big black nose";
		
		String[] a = s1.split(" ");
		
		
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i].equals(a[j]))
					cnt++;
			}
			if(cnt ==1)
				System.out.println(a[i]+" ");
		}

	}

}
