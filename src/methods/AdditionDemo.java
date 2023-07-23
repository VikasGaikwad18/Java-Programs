package methods;

public class AdditionDemo {
	
	int num1 = 10;
	int num2 = 20;
	
	int result = 0;
	
	public int addition(int num1, int num2)      // with return type with parameter
	{
		int result = num1+num2;
		return result;
	}
	
	public void sub()          // without return type without parameter
	{
		int result = num1 - num2;
		System.out.println(result);
	}
	
	public void mult(int num1, int num2) // without return type  with parameter
	{
		int result = num1*num2;
		System.out.println(result);
	}
	
	public int div()          // with return type without parameter
	{
		int result = num1/num2;
		return result;
	}

}
