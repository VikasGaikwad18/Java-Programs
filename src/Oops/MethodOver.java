package Oops;

public class MethodOver {

	public static void main(String[] args) {
		System.out.println("in String args");
        add(10);
        main(new int[1]);
        
 
	}
	public static void main(int[] args)
	{
		System.out.println("in int args");
	}
	public static void add(int b) {
		System.out.println("double b");
	}
	public static void add(float b)
	{
		System.out.println("float b");
	}

}
