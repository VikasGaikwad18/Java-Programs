package Collection;
import java.util.*;

public class SublistOfAL {

	public static void main(String[] args) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    al.add(50);
	    al.add(60);
	    
	    
ArrayList<Integer> al2 = new ArrayList<Integer>();
		
	    al2.add(10);
	    al2.add(20);
	    al2.add(30);
	    al2.add(40);
	   
	    // SubList OF List.....
	    int start = 2;
	    int end = 5;
	    
	    List<Integer> mySublist = al.subList(start, end);
	    
	    System.out.println(mySublist);
	    
	    // Compare Two List
	    
	    boolean result = al.equals(al2);
	    System.out.println(result);
	    
	    // join two List
	    al.addAll(al2);
	    System.out.println(al);
         
	    
	    // Clone Method(Copy List)
	    
	    ArrayList<Integer> al3	= (ArrayList<Integer>)al2.clone();
	    
	    System.out.println(al3);
	    }

}
