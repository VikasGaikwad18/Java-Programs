package apurva;
import java.util.*;

public class arry {
	
	public static void main(String args[])
	{
		byte b = 10;
        execute(b);
        execute(b, b);
        execute(b, b, b);
        execute(b, b, b, b);
	}	
	
	 static void execute(Byte x, Byte y) {
	        System.out.println("execute, execute");
	    }
	    static void execute(Byte x, Byte y, Byte z) {
	        System.out.println("execute, execute, execute");
	    }
	    static void execute(byte... x) {
	        System.out.println("execute");
	    }
}