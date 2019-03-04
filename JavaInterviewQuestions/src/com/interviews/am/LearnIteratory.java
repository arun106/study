package com.interviews.am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnIteratory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////////////LIST///////////////////
		System.out.println("List");
		List<Integer> list = new ArrayList<>();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		for(Integer i:list)
			System.out.println("For iterating:"+i);
		
		for(int i=0;i<list.size();i++)
			System.out.println("List item:"+list.get(i));
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println("List item iterator:"+(Integer) itr.next());
		
		List<String> list1 = new LinkedList<>();
		list1.add("s1");
		list1.add("s2");
		list1.add("s3");
		
		for (int i=0;i<list1.size();i++)
			System.out.println("Linked list item:"+list1.get(i));
		
		Stack<String> stack = new Stack<>();
		stack.push("stack1");
		stack.push("stack2");
		stack.push("stack3");
		
		for(String s:stack)
			System.out.println("Iterating for stack:"+s);
		
		
		for (int i=0; i<stack.size();i++)
			System.out.println("stack:"+stack.get(i));
		
		if(stack.contains("stack1"))
			System.out.println("Item present");
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		
		
//		System.out.println(list);
//		list.add(1, 21);
//		System.out.println(list);
//		
		///////////////SET///////////////
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		set.add(2);
		System.out.println(set);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(3);
		set1.add(2);
		
		System.out.println(set1);
		
		Set<String> set2 = new TreeSet<>();
		set2.add("aa");
		set2.add("ca");
		set2.add("ba");
		set2.add("aa"); //duplicate
		
		
		System.out.println("Tree set"+set2);
		
		//System.out.println("Tree set##############"+set2.);
		
		/////////////////MAP//////////////////
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "map1");
		map.put("2", "map2");
		map.put("3", "map3");
		System.out.println(map);
		
		for (Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+"###"+m.getValue());
		}
		System.out.println(map);
		
		
		Map<String,String> map1 = new TreeMap<>();
		map1.put("1", "map1");
		map1.put("5", "map5");
		map1.put("3", "map3");
		map1.put("2", "map2");
		System.out.println("Tree map" + map1);
		
		
		for(String s:map.keySet())
			System.out.println("for loop map:"+s+" value:"+map.get(s));
		
		
		if(map.containsKey("1"))
			System.out.println(map.get("1"));
		
		int[] x = {1,2,3,4,5};
		
	}

}
