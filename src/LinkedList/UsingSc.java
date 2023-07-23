package LinkedList;
import java.util.*;

public class UsingSc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Zeroth number");
		int a = sc.nextInt();
		System.out.println("Enter First number");
		int b = sc.nextInt();
		System.out.println("Entere Second Number");
		int c = sc.nextInt();
		
		int sum= a+b+c;
		System.out.println("Sum is :"+sum);
		
		int[] m = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()}; 
		
		System.out.println(Arrays.toString(m));

	}

}
