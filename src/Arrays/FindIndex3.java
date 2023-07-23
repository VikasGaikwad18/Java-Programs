package Arrays;

public class FindIndex3 {

	public static void main(String[] args) {
	 int[] a = {1,2,3,4,5,5,6};
	 
	 int num = 5;
	 
	 for(int i=0; i<a.length; i++)
	 {
		 if(a[i]==num)
		 {
			 System.out.println(i);
		 }
	 }

	}

}
