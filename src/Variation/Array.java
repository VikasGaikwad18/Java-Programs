package Variation;

public class Array {

	public static void main(String[] args) {
		
		int[] a = {12,35,13,0,0,0};
		int sum =0;
		int cnt =0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				sum+=a[i];
				cnt++;
			}
		}
		int[] b = new int[a.length-cnt];
		int indx =0;
		int sum2 = 100-sum;
		int firstNum = sum2/3;
		int secNum = sum2/3;
		int thirdNum = sum2-firstNum-secNum;
		b[0] = firstNum;
		b[1] = secNum;
		b[2] = thirdNum;
		
//		for(int i=0; i<b.length; i++)
//			System.out.println(b[i]);
		
		int[] c = new int[cnt+b.length];
		for(int i=0; i<a.length; i++)
			{
			if(a[i]>0)
			c[indx++] = a[i];
			
			}
		for(int i=0; i<b.length; i++)
		{
			c[indx++] = b[i];
		
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
			
		
		}
	}

}
