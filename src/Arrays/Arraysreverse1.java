package Arrays;

public class Arraysreverse1 {

	public static void main(String[] args) {
		int[] a = {9,8,7,6,5,4,3,2,1};
		
		
		
		int i= 0;
		int j = a.length-1;
		
		while(i<j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k]+" ");
		}

	}

}
