package Arrays;

public class Max_min2 {
	
	public static int getMax(int[]m)
	{
		int max1 = Integer.MIN_VALUE;
		
		for(int i=0; i<m.length; i++)
		{
			if(m[i]>max1)
				max1 = m[i];
		}
		return max1;
	}
	
	public static int getmin(int[] m)
	{
		int min1 = Integer.MAX_VALUE;
		for(int i=0; i<m.length; i++)
		{
			if(m[i]<min1)
				min1 = m[i];
		}
		return min1;
	}
	
	public static void main(String [] args)
	{
		
		int [] m = {2,34,55,78,99};
		
		int max1 = getMax(m);
		int min1 = getmin(m);
		
		System.out.println(max1);
		System.out.println(min1);
		System.out.println(max1-min1);
		
	}

}
