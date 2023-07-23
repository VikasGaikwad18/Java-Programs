package Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,4,5,6,6,1,7,7};
		
		for(int i=0; i<a.length; i++)
		{
			boolean isDuplicate = isElementDuplicate(a,i);
			
		if(isDuplicate==false)
			System.out.print(a[i]+" ");
		}
	}
	private static boolean isElementDuplicate(int[] a, int i) 
	{
		for(int j=0; j<i; j++)
		{
			if(a[j]==a[i])
				return true;
		}
		return false;
	}

}
