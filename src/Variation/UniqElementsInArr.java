package Variation;

public class UniqElementsInArr {

	public static void main(String[] args) 
	{
		int[] a = {1,1,1,1,1,1,2,35,79};
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]-a[i-1]==0)
			{
				System.out.println(a[i]);
				break;
			}
			else
				i++;
			
		}
		
	}

}
