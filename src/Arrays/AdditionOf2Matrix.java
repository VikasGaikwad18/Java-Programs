package Arrays;

public class AdditionOf2Matrix {

	public static void main(String[] args) {
		
		int[][]a = {{1,2,3,4},
				    {5,6,7,8},
				    {9,0,1,2},
				    {3,4,5,6}};
				// Addition of two matrix
		int[][]b = {{1,2,3,4},
				{5,6,7,8},
				{9,0,1,2},
				{3,4,5,6}};
		
		int[][] c = new int[a.length][a[0].length];
		
		for (int i = 0; i < c.length; i++) 
		{
		for(int j=0; j<c[i].length; j++)
		{
			c[i][j] = a[i][j]+b[i][j];
			
		}
		}
		for (int i = 0; i < c.length; i++) 
		{
			for(int j=0; j<c.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
