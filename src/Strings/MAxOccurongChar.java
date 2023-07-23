package Strings;

public class MAxOccurongChar {

	public static void main(String[] args) {
		
		String s = "ffabcdsesa";
		
		
		char[] a = s.toCharArray();
		
		int uniqCnt=0;
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				uniqCnt++;
		}
		char[] b = new char[uniqCnt];
		
		int indx =0;
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				b[indx++]=a[i];
		
		}
		int[] m = new int[uniqCnt];
		
		for(int i=0; i<b.length; i++)
		{
			char ch = b[i];
			int cnt =0;
			for(int j=0; j<s.length(); j++)
			{
				if(ch==s.charAt(j))
					cnt++;
				
				m[i]=cnt;

			}
		}
for(int i=0; i<b.length; i++)
{
	System.out.println(b[i]+" "+m[i]);
}
		
		
	}}
