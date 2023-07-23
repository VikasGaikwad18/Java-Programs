package Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int [] a = {11,23,45,67,98,76,85};
		
		int[] b = new int[a.length];
		int[] c = new int[b.length];
		
		// before
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
		for(int i=0; i<b.length; i++)
		{
			c[i]=a[i];
			System.out.print(c[i] +" ");
		}

	}

}
