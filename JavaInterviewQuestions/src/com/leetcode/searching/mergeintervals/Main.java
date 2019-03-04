package com.leetcode.searching.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	class StartComparator implements Comparator<Interval> {
		@Override
		public int compare(Interval arg0, Interval arg1) {
			// TODO Auto-generated method stub
			return arg0.start-arg1.start;
		}	
	}
	
	public static void main(String[] args) {
		List<Interval> list = new ArrayList<Interval>();
		list.add(new Interval(1,4));
		list.add(new Interval(2,3));

		List<Interval> li = merge(list);
		System.out.println(li);
	}
	public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new ArrayList();
		int index=-1;
		Main main = new Main();
		Collections.sort(intervals, main.new StartComparator());
        for(Interval i:intervals) {
        	if(index < 0) {
        		list.add(i);
        		index++;
        	}
        	else {
        		if(list.get(index).end >= i.start) {
        			list.get(index).end = Math.max(i.end, list.get(index).end);
        			list.get(index).start = Math.min(list.get(index).start, i.start);
        		}
        		else {
        			list.add(i);
        		}
        	}
        }
		return list;
    }
}

