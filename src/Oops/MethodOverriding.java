package Oops;

// 07:55 minute of oops video
class p
{
	public Object m1()
	{
		return null;
	}
	public void m2()
	{
		System.out.println("Parent 2 ");
	}
}
class c extends p
{
	public String m1()
	{
		return null;
	}
	
}

public class MethodOverriding 
{
	public static void main(String[] args) 
	{
		
		p m = new c();
		m.m1();
		
	}

}
