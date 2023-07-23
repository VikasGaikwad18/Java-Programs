package Arrays;

public class CheckEquality {

	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,};
		
		int[] b = {11,22,33,44,55,67};
		
		
		if(a.length==b.length)
		{
			boolean isEqual = checkElementsEqual(a,b);
			if(isEqual)
				System.out.println("Arrays are equal");
			else
				System.out.println("arrays are not equal");
		}
		else
			System.out.println("Arrays are not equal");

	}

	private static boolean checkElementsEqual(int[] a, int[] b) 
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != b[i])
					return false;
		}
	
	return true;

}
}
