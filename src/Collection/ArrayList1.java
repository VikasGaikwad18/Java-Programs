package Collection;

import java.util.*;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		Integer num = a1.get(1);
		System.out.println(num);
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		
		Integer s = a1.set(0, 9);
		System.out.println(a1);
		
		
		LinkedList<String> ll = new LinkedList(a1);
		System.out.println(ll);

	}

}
