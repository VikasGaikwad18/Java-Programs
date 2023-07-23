package Arrays;

public class uniqElement {

	public static void main(String[] args) 
	{
		
    int[] a = {4,4,0,0,0,7,8,0,9};
    
    int[] b = new int[a.length];
    int indx =0;
    
    for(int i=0; i<a.length; i++)
    {
    	if(a[i]==0)
    		b[indx++] = a[i];
    }
    for(int i=0; i<a.length; i++)
    {
    	if(a[i]!=0)
    		b[indx++] = a[i];
    }
    for(int i=0; i<b.length; i++)
    	System.out.print(b[i]+" ");

	}

}
