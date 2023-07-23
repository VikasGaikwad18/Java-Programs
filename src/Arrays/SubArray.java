package Arrays;

public class SubArray {

	public static void main(String[] args) {
		
		
		int[]a = {3,7,90,20,5,50,40,7,1,1};
		
		int k=3;
		
		
		int min = Integer.MAX_VALUE;
		int indx =0;
		for(int i=0; i<a.length-k+1; i++)
		{
			int sum =0;
			for(int j=i; j<i+k; j++)
			{
				sum =sum+a[j];
			}
			int avg = sum/k;
			if(avg<min) {
				min = avg;
				indx=i;
			}
		}
		System.out.println(min);
		System.out.println(indx);
		
		
	}

}
