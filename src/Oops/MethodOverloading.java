package Oops;

public class MethodOverloading 
{
	public void m1(int i)
	{
		System.out.println("This isGeneral Method");
	}
	public void m1(int ... i)
	{
		System.out.println("This is var arg Method ");
		
	}

	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.m1();
		m.m1(10,20,30);
		m.m1(2);
		

	}

}
