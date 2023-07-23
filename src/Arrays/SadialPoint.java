package Arrays;

public class SadialPoint {

	public static void main(String[] args) {
	
		
		int[][] a=
			{
				{
					6,3,9
				}
				,
				{
					9,7,8
				}
				,
				{
					2,4,5
				}
				,
			}
			;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int col=0;
				for (int k = 0; k < a.length; k++) 
				{
					if(a[i][j]>a[i][k])
					{
						col++;
					}
				}
				int row=0;
				for (int l = 0; l < a.length; l++) 
				{
					if(a[i][j]<a[l][j])
					{
						row++;
					}
				}
				if(col==0 && row==0)
				{
					System.out.println(a[i][j]);
				}
				
			}
		}

	}

}
