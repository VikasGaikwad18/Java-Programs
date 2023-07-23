package Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = {11,2,3,4,5,0,45,12};
		
		
		for(int i=0; i<a.length; i++)
		{
			int j = i-1;
			for( ; j>=0; j--)
			{
				if(a[j]<a[i])
					break;
			}
			rotateRight(a,j+1,i);
		}
		print(a);

	}

	private static void print(int[] a) {
		for(int i=0; i<a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

	private static void rotateRight(int[] a, int e, int s) {
		int temp = a[s];
		for(int p=s; p>e; p--)
		{
			a[p] = a[p-1];
		}
		a[e] = temp;
		
	}

}
