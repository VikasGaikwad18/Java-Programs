package Variation;

public class SeparateCharAndNumString {

	public static void main(String[] args) {
		
		String s = "abcd12 , !!, ef , 34!!, 123ghi";
		
		char[] a = s.toCharArray();
		
		String s1 = "";
		String s2= "";
		String s3 = "";
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>='a' && a[i]<='z' || a[i]>='A' && a[i]<='Z')
				s1 += a[i];
			else if (a[i]>='0' && a[i]<='9')
				s2 += a[i];
			else
				s3+= a[i];
		}
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
