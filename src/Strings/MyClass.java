package Strings;
public class MyClass 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int val[] = new int[] 
				{
					60, 100, 120 
				}
				;
				int wt[] = new int[] 
				{
					10, 20, 30 
				}
				;
				int W = 50;
				int n = val.length;
				myCode(W, wt, val, n);
	}
	//EndOfMainMethod
	private static void myCode(int w, int[] wt, int[] val, int n)
	{
		//int max = Integer.MIN_VALUE;
		int count = 0;
		for(int j = 0; j<wt.length-1; j++)
		{
			if(wt[j]+wt[j+1]==w)
			count=1;
			else 
			count=0;
		}
		int sum = 0;
		for(int j = n-1; j>=count; j--)
		sum+=val[j];
		System.out.println(sum);
		//System.out.println(count);
	}
}