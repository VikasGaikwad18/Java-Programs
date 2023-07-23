package Arrays;

public class InsertionSort2 {

	public static void main(String[] args) {
		
		int[] a = {2,1,3,532,54,34};
		
		for(int i=1; i<a.length; i++)
		{
			int m = a[i];
			int j = i-1;
			while(j>=0 && m<a[j])
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = m;
		}
		for(int i=0; i<a.length; i++)
		System.out.print(a[i]+" ");

	}

}
