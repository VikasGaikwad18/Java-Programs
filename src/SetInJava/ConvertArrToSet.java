package SetInJava;

import java.util.HashSet;
import java .util.TreeSet;
import java.util.LinkedHashSet;

public class ConvertArrToSet {

	public static void main(String[] args) {
		int a[] = {11,45,32,44,34,89};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		TreeSet<Integer> ts = new TreeSet<Integer>(); // Maintain Ascending order
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
			ts.add(a[i]);
			lhs.add(a[i]);
		}
		System.out.println(lhs);
		System.out.println(hs);
		System.out.println(ts);
		
		

	}

}
