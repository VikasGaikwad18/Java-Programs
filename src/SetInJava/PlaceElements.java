package SetInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PlaceElements {

	public static void main(String[] args) {
		
		HashSet<Integer> lhs = new HashSet<Integer>();
		lhs.add(160);
		lhs.add(212);
		lhs.add(48);
		lhs.add(64);
		lhs.add(100);
		lhs.add(100);
		lhs.add(null);
		lhs.remove(7);
		
		System.out.println(lhs);

	}

}
