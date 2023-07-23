package Arrays;

public class SecondMax {

	public static void main(String[] args) {
		int [] a= {45,76,68,12,98,96,99,100};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != max && a[i]>max2)
				max2 = a[i];
		}
		System.out.println(max2);
	}

}
