package Oops;

class Animal
{	
}

class Monkey extends Animal
{
	
}

// In the Method Overloading Method resolution is always based on reference type
// but not based on runtime  Object.. 
public class Test 
{
	public void m1(Animal a)
	{
		System.out.println("This is Animal Version");
	}
	
	public void m1 (Monkey m)
	{
		System.out.println("This is monkey Version");
	}

	public static void main(String[] args) 
	{
		Test t = new Test();
		
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		Animal a1 = new Animal();
		t.m1(a1);
		
		Monkey m1 = new Monkey();
		t.m1(m1);
		
		

	}

}
