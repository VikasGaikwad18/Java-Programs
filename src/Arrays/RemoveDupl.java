package Arrays;

public class RemoveDupl {
	
	public static boolean SearchElement(int[] a, int i)
	{
		for(int j=0; j<i; j++)
		{
			if(a[j]==a[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,4,5,5,5,6,7,8,8};
		
		for(int i=0; i<a.length; i++)
		{
			boolean isDuplicate = SearchElement(a,i);
			
			if(isDuplicate==false)
				System.out.print(a[i]+" ");
		}

	}

}
