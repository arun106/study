package com.Infy;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hTable = new Hashtable<Integer,String>();
		hTable.put(1, "Arun");
		hTable.put(2, "Arya");
		hTable.put(3, "Appu");
		/*for(Map.Entry m:hTable.entrySet())
		{
			if(m.getKey().equals(3))
				hTable.remove(3);
		}*/
		for(Map.Entry m:hTable.entrySet())
			System.out.println(hTable);	
		
		System.out.println(hTable);
		
		Hashtable ht = new Hashtable();
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put("a", "D");
		System.out.println(ht);
		
		if(ht.containsKey(3))
			System.out.println(ht.get(3));
	}

}
