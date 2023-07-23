package Arrays;

public class EvenOddArray12 {

	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,77,88,99};
		
		int evenCnt=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				evenCnt++;
		}
		int[] evenArr = new int[evenCnt];
		int [] oddArr = new int[a.length-evenCnt];
		
		int evenIndx = 0;
		int oddIndx = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				evenArr[evenIndx++]=a[i];
			else
				oddArr[oddIndx++] = a[i];
		}
		
		print(evenArr);
		System.out.println();
		print(oddArr);

	}

	private static void print(int[] Arr) {
		
		for(int i=0; i<Arr.length; i++)
		{
			System.out.print(Arr[i]+" ");
		}
		
	}

}
