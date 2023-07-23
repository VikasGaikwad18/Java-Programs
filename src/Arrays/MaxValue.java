package Arrays;

public class MaxValue {

	public static void main(String[] args) {
		
		int [] a = {97,3,5,87,9,86,14,45,67,98};
		
		int max = 0;
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		System.out.println(max);
	}
}
