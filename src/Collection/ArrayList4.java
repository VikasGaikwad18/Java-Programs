package Collection;
import java.util.*;

public class ArrayList4 {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Green");
		al.add("Red");
		al.add("Green");
		
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
		
		System.out.println("----------------------");
		
		// while
		int i=0;
		while(i<al.size())
		{
			System.out.println(al.get(i));
			i++;
		}
		
		
		System.out.println("-----------------------");
 
		// for each loop
		
		for(String data : al)
			System.out.println(data);
		
		
		System.out.println("----------------------");
		
		// Iterator
		
		Iterator<String> it = al.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

	

}
