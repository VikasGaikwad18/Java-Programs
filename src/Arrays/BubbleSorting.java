package Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[]  a = {45,78,56,21,11,9,8};
		print(a);
		
		
		for(int j=0; j<a.length; j++)
		{
			for(int i=0; i<a.length-1; i++)
			{
				if(a[i]>a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
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
		System.out.println();
		
	}
	

}
