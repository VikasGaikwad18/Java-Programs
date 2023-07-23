package Oops;
import java.util.*;
public class Tets 
{
	public void m1()
	{
		System.out.println("This is m1 with no argument method");
	}
	
	
	public void m1(float j)
	{
		System.out.println("This is float method");
	}
	
	public static void main(String[] args) 
	{
		Tets t= new Tets();
		t.m1();
		t.m1(15.60f);
		t.m1(32);
		t.m1('m');
		
		
		
	}
}
