package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		int num = al.get(1);
		System.out.println("get method : "+num);
		
		// al.clear();   :- clear Method 
		
		boolean isContains = al.contains(100);
		System.out.println("contains method : "+isContains);
		
		int indx = al.indexOf(20);
		System.out.println("index of method : "+indx);
		
		int indx2 = al.lastIndexOf(20);
		System.out.println("last Index of Method : "+indx2);
		
		boolean isEmpty = al.isEmpty();
		System.out.println("isEmpty Method : "+isEmpty);
		
		al.remove(2);
		System.out.println(al);
		
		al.set(1, 100);
		System.out.println(al);
		
		Object[] a= al.toArray();
		System.out.println(Arrays.toString(a));
		
		int size = al.size();
		System.out.println("Size Method : "+size);
		

	}

}
