package methods;

public class ArraysBasic {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		
		a[2] = 100;
		a[3] = 200;
		a[0] = 5;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
