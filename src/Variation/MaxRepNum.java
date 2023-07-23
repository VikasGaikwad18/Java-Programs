package Variation;

import java.util.TreeMap;

public class MaxRepNum {

	public static void main(String[] args) 
	{
		int k = 3;
		int n = 4;
		int[] a = {2,2,1,2,1};
		
		int m = 0;
		int min = Integer.MAX_VALUE;
		TreeMap<Integer,Integer> tm = new TreeMap<>();
		
		for(int ele : a)
		{
			if(tm.containsKey(ele))
			{
				int val = tm.get(ele);
				val++;
				tm.put(ele, val);
			}
			else
				tm.put(ele, 1);
		}
		int max = Integer.MIN_VALUE;
		int mainKeys = -1;
		
		for(int key : tm.keySet())
		{
			if(tm.get(key)>max)
			{
				max = tm.get(key);
				mainKeys = key;
				}
		}
		
		System.out.println(mainKeys);
		

	}

}
