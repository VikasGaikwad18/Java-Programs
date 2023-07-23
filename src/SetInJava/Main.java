package SetInJava;
import Oops.Tets;

 final class A
{
	public  void m1()
	{
		System.out.println("This is private class method");
	}
}

public class Main{

	public static void main(String[] args) 
	{
		Tets t = new Tets();
		t.m1();
		A a = new A();
		a.m1();

	}

}
