package Collection;

import java.util.ArrayList;

public class AddOneListToAnother {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		ArrayList<String> al2 = new ArrayList<String>(al);
		
		System.out.println(al2);
		
		// second way

		al2 = (ArrayList<String>) al.clone();
		System.out.println(al);
		System.out.println(al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		al3.add(11);
		al3.add(12);
		al3.add(15);
		al3.add(16);
		
		System.out.println(al3);
		
		
	}

}
