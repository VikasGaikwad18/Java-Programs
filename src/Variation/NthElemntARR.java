package Variation;

public class NthElemntARR {

	public static void main(String[] args) {
		
		int n = 3;
		int a[] = {1,2,4,5,7};
		
		for(int i=0; i<a.length; i++)
		{
			if(n==i+1)
				System.out.println(a[i]);
			
		}

	}

}
