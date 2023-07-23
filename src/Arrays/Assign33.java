package Arrays;

public class Assign33 {

	public static void main(String[] args) {
		
		int[]a = {3,4,5,7,9,9,2,5,7};
		
		//Sub Array
		int k = 3;
		int min = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i=0; i<a.length-k+1; i++)
		{
			int sum = 0;
			for(int j=i; j<i+k; j++)
			{
				sum+=a[j];
			}
		
		int avg = sum/k;
		if(avg<min)
		{
			min = avg;
			index = i;
			
		}
		}
		System.out.println(min +" "+index);

	}

}
