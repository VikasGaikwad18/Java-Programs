package Arrays;
public class SaddlePointHef {
	public static void main(String[] args) {
		int[][]a = {{1,2,3},
				{4,5,6},
				{2,3,4}};
		int cnt =0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				boolean smallestInRow = isSmallestInRow(a,i,j);
				if(smallestInRow)
				{
					boolean isLargestInColumn = isLargestinCol(a,i,j);
					if(isLargestInColumn)
					{
						System.out.println(a[i][j]);
						cnt++;
					}
				}
			}
		}
			if(cnt==0)
			{
				System.out.println("no saddle point");
			}
	}
	private static boolean isLargestinCol(int[][] a, int i, int j) {
		for (int k = 0; k < a.length; k++) 
		{
			if(a[k][j]>a[i][j])
				return false;
		}
		return true;
	}

	private static boolean isSmallestInRow(int[][] a, int i, int j) {
		//a[i][j]
		for (int k = 0; k < a.length; k++) 
		{
			if(a[i][k]<a[i][j])
				return false;
		}
		return true;
	}
}


