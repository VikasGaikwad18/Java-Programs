package Arrays;

public class Practise {

	public static void main(String[] args) {
		
		String s1="absd12";
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{	
			cnt++;
		}
		String s3="";
		for(int i=0;i<s1.length();i++)
		{	
			if(s1.charAt(i)>'0' && s1.charAt(i)<'9')
			{
				s3=s3+(int)s1.charAt(i);
			}
		}
		int a=Integer.parseInt(s3); 
		if(a==cnt)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		

	}

}
