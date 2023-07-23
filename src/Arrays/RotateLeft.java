package Arrays;

public class RotateLeft {
	
	public static void main(String[] args) {
		
	
	int [] a = {9,8,8,6,4,4,5,6};
	
  print(a);
  int temp = a[0];
  for(int i=0; i<a.length-1; i++)
  {
	  a[i]= a[i+1];
	  
	
  }
  a[a.length-1] = temp;
	  print(a);
	  
  }
  
	

	private static void print(int[] a) {
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
	}
}

