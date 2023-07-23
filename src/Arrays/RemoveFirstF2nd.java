package Arrays;

public class RemoveFirstF2nd {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 1, 2, 2, 3, 4 };
		int[] b = { 1, 2, 4 };

		for (int i = 0; i < b.length; i++) {
			int cnt = 0;
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j])

					cnt++;

				if (cnt == 2)

					break;
			}

			int[] c = new int[a.length - cnt];
			int index = 0;
			int recent = 0;
			for (int k = 0; k < a.length; k++) 
			{
				if (b[i] != a[k] || recent == 2) 
				{
					c[index++] = a[k];

				} else 
				{
					recent++;
				}
			}
			
				a = c;

			

		}
		for (int x : a) 
		{
			System.out.println(x);

		}

	}

}
