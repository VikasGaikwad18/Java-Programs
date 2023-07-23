package Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		
		int[] a = {2,4,6,8,10,12,14,16,18};
		
		int num = 10;
		
		int result = find(a,num);
		
		if(result==-1)
			System.out.println("not found");
		else
			System.out.println("found at index "+result);

	}

	public static int find(int[] a, int num) 
	{
		int s = 0;
		int e = a.length-1; 
		
		while(s<=e)
		{
			int mid = (s+e)/2;
			
			if(a[mid]==num)
				return mid;
			else if(num>=a[mid])
				s= mid+1;
			else
				e = mid-1;
		}
		return -1;
		
	}
	
}
