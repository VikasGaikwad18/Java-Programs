package Exception_Handling;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7};
		
		try
		{
			System.out.println(a[4]);
			System.out.println("Have a nice day .....!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You entered out of bound exceptions");
			
		}
		finally
		{
			System.out.println("thank you ..");
		}

	}

}
