package Arrays;

public class ContainsSpecificValue {

	public static void main(String[] args) {
		
		int[]a = {12,15,12,14,45,24};
		
		int ele = 454;
		
		boolean isPresent = FindElement(a,ele);
		
		if(isPresent==true)
		{
			System.out.println("found");
		}
		else
			System.out.println("not found");

	}

	private static boolean FindElement(int[] a, int ele) {
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==ele)
			{
				return true;
			}
		}
		return false;
	}

}
