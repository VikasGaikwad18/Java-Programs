package Arrays;

public class UniquePair {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,4};
		
		a = removeDuplicate(a);
		
		for(int i=0; i<a.length; i++)
		{
			for(int j= i+1; j<a.length; j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}

	}

	static int[] removeDuplicate(int[] a) {
		
		int newArrLength = 0;;
		for(int i=0; i<a.length; i++)
		{
			int cnt =0;
			for(int j=0; j<i; j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
			newArrLength++;
		}
	
	int[] b = new int[newArrLength];
	int index = 0;
	
	for(int i=0; i<a.length; i++)
	{
	int cnt =0;
	for(int j=0; j<i; j++)
	{
		if(a[i]==a[j])
			cnt++;
		
	}
	if(cnt==0)
		b[index++] = a[i];
	}
	return b;
	
}
}
