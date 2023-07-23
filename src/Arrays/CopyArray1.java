package Arrays;

public class CopyArray1 {

	public static void main(String[] args) {
		
		int[] a= {11,22,33,44,55};
		
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			b[i] = a[i];
		}
		
	printArray(b);
	}

	private static void printArray(int[] b) {
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}
