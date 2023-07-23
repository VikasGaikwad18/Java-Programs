package apurva;

public class nth_element {

	public static void main(String args[])
	{
		int n=3;
	int a[]= {3,8,2,7,4,1};
	
	for(int i=0;i<a.length;i++)
	{
	if(n==i+1)
		System.out.println(a[i]);
	}
	}
}
