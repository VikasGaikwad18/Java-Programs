package Oops;

abstract class Ajay
{
	public static void main(String[] args) 
	{
		
		 String a = "hi %s welcome %s";
	        System.out.print(String.format(a, "string", "= ", "This is "));
	        String b = "and number is %d + %d";
	        System.out.println(String.format(b, 10, 15));
	}
}