package Arrays;

public class Max_min {

	public static void main(String[] args) {
		
		int[] a = {11,34,56,76,100};
		
		int max = getMax(a);
		int min = getMin(a);
		
		System.out.println(max-min);

	}  
	private static int getMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

	private static int getMin(int[] a) {
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
				min= a[i];
		}
		return min;
	}

}
