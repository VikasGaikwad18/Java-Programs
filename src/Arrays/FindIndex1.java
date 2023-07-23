package Arrays;

public class FindIndex1 {

	public static void main(String[] args)
	{
		
		int[] a = {45,44,25,23};
		
		int num = 23;
		int index = searchElement(a,num);
		
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println(index);
		
		

	}
	public static int searchElement(int[] a,int num)
	{
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num)
				return i;
			return a[i];
		}
		return -1;
	}

}
