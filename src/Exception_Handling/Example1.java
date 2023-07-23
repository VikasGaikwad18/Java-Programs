package Exception_Handling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter First number");
		int a = sc.nextInt();
		System.out.println("eneter Second number");
		int b = sc.nextInt();
		
		int a1= 10;
		int b1 = 20;
		
		try
		{
			System.out.println(a/b);
			System.out.println(a1/b1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception has been occured...");
		}
		finally
		{
			System.out.println("finished");
			System.out.println("This is exception Handlig in java");
		}
		
		

	}

}
