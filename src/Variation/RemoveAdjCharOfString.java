package Variation;

public class RemoveAdjCharOfString {

	public static void main(String[] args) {
		
		String m = "abccbzccbca";
		
		char[] a = m.toCharArray();
		int indx =0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] !=a[indx])
			{
				indx++;
				a[indx] = a[i];
			}
			//System.out.print(a[i]);
		}
		
for(int i=0; i<a.length; i++)
	System.out.print(a[i]);
	}

}
