package methods;


 class Test {
	 
	 public void clearAll()
	 {
		 int a = 15;
		 int b = 20;
		 
		 System.out.println(a+b);
	 }
	 
	 protected void PrintNum()
	 {
		 int k = 3;
		 int j = 5;
		 System.out.println(k*j);
	 }
	
	
	
}
public class Test1 extends Test {

	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.clearAll();
		obj.PrintNum();
		
		System.out.println(1/0);
		doStuff();
		

	}
	public static void doStuff()
	{
		moredoStuff();
		System.out.println(10/0);
	}
	public static void moredoStuff()
	{
		System.out.println("Hello");
	}

}


