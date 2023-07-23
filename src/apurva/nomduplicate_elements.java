package apurva;

public class nomduplicate_elements {
	public static void main(String args[]) {
		int a[] = { 1, 5, 7, 2, 6, 1, 4, 2, 1, 6, 4, 3, 9 };

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					cnt++; 
			}
		
		if(cnt==1)
		{
			System.out.println(a[i]+" ");
		}
	}
}
}
