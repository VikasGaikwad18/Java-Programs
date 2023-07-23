package MultiThreading;

public class MyClass extends Thread {
	
	public void run()
	{
		for(int i=0; i<5; i++)
			System.out.println("Hii this is vikas...");
	}
	
	

	public static void main(String[] args) {
		  MyClass m = new MyClass();
		  m.start();
		  m.start();
		 // m.start();
		  
		  for(int i=0; i<5; i++)
			  System.out.println("This is Main..");

	}

}
