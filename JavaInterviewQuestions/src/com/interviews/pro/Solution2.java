package com.interviews.pro;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		List<Integer> listfrom = new ArrayList<>();
		List<Integer> listto = new ArrayList<>();
		List<Integer> cityWeight = new ArrayList<>();
		listfrom.add(1);listfrom.add(1);listfrom.add(1);listfrom.add(2);listfrom.add(2);listfrom.add(3);
		listto.add(2);listto.add(3);listto.add(4);listto.add(3);listto.add(4);listto.add(4);
		cityWeight.add(1);cityWeight.add(3);cityWeight.add(2);cityWeight.add(1);cityWeight.add(1);cityWeight.add(1);
		
		System.out.println(findCapitalCity(1,4,listfrom,listto,cityWeight));
	}
	public static int findCapitalCity(int robber_distance, int cityNodes, 
			List<Integer> cityFrom, List<Integer> cityTo, List<Integer> cityWeight) {
		int max = Integer.MAX_VALUE, node = 0;
		int[] arr = new int[cityNodes];
		for(int i=0; i<cityFrom.size(); i++) {
			if (cityWeight.get(i)<=robber_distance) {
				arr[cityFrom.get(i)-1]+=cityWeight.get(i);
			}
		}
		for(int i=0; i<cityTo.size(); i++) {
			if (cityWeight.get(i)<=robber_distance) {
				arr[cityTo.get(i)-1]+=cityWeight.get(i);
			}
		}
		for (int i=0; i<cityNodes; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i=cityNodes-1; i>=0; i--) {
			if(arr[i] < max) {
				max = arr[i];
				node = i;
			}
		}
		System.out.println(max);
		return node+1;
    }
}
