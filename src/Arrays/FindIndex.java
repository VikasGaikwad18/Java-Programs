package Arrays;

public class FindIndex {
	public static void main(String[] args) {
		int [] a = {11,14,15,14,15,90};
		
		int num = 14;
		
		int cnt = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==num) {
				System.out.println(i);
			cnt++;
			
			}
			
		}
		if(cnt==0)
			System.out.println("not found");
				
		}
}