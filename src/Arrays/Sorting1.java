package Arrays;

public class Sorting1 {

	public static void main(String[] args) {
		
		int[] a = {11,34,211,32,43,9,8,65};
		
		
		for(int i=0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
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
			System.out.println(a[i]+" ");
		}
		
	}
}