package Oops;

public class A
{
	public void m1()
	{
		System.out.println("This is protected method");
	}
}

class B extends A {

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		
		
		A a1 = new A();
		a1.m1();
		
	}
	protected void m3()
	{
		System.out.println("This is B class Protected method");
	}

}
