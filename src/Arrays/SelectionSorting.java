package Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		
		int[] a = {10,5,8,3,15,12};
		
		// selection sorting
		for(int i=0; i<a.length; i++)
		{
			int min = i;
			for(int j= i+1; j<a.length; j++)
			{
				if(a[j]<a[min])
					min = j;
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

}
