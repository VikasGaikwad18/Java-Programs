package methods;

abstract class v1{
	public void add()
	{
		System.out.println("additon");
	}
	public void sub()
	{
		System.out.println("subtraction");
	}
	
}
class v2 extends v1
{
	public void mult()
	{
		System.out.println("mul");
	}
	public void div()
	{
		
	}
}

public class Calculator {

	public static void main(String[] args) {
		SrDev obj = new SrDev();
		obj.add();
		obj.sub();
		obj.mult();
		obj.div();

	}

}
