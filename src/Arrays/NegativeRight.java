package Arrays;

public class NegativeRight {

	public static void main(String[] args) {
		         // i
		int [] a= {-12,20,45,65,78,-7,8,4};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(i<j && a[i]<0 && a[j]>0)
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		print(a);

	
	}
	private static void print(int[] a) {
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}}


