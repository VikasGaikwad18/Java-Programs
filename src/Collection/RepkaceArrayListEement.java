package Collection;

import java.util.*;

public class RepkaceArrayListEement {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Black");
		al.add("Green");
		al.add("red");
		
		String ele = "white";
		String ele2 = "red";
		
		for(int i=0; i<al.size();i++)	
		{
		if(al.get(i).equals(ele2))
			{
			al.set(i, ele);
			}
		}
		System.out.println(al);
	}
	

}
