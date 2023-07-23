package Arrays;

public class erp_non_diagonal 
{
		public static void main(String[] args) 
		{
			int[][] a= 
			{
				{
					1,12,3,4
				}
				,
				{
					5,6,6,8
				}
				,
				{
					9,1,2,5
				}
				,
				{
					7,2,4,45
				}
			}
			;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int[][] a) 
		{
			int sum =0;
			double cnt=0;
			for(int i=0; i<a.length; i++)
			{
				for(int j=0; j<a[i].length; j++)
				{
					if(j-i==0 || j+i==a.length-1)
					{
						continue;
					}
					sum = sum+a[i][j];
					cnt++;
				}
			}
			
			System.out.println(sum);
			System.out.println(sum/cnt*1.0);
		}
	}


	