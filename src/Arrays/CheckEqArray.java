package Arrays;

public class CheckEqArray {

	public static void main(String[] args) {
		
		int[] a = {1,3,5,8,9};
		int[] b = {1,3,5,8,9};
		
		boolean result = checkEquality(a,b);
		
		if(result)
			System.out.println("arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}

	private static boolean checkEquality(int[] a, int[] b) {
		
		if(a.length != b.length)
			return false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != b[i])
				return false;
		}
		return true;
	}

}
