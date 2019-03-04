package com.hackerrank.implementation.gridsearch;

public class Main {

	public static void main(String[] args) {
		String[] G = {"1234567890",  
				"0987654321",  
				"1111111111",  
				"1111111111",  
				"2222222222"};
		String[] P = {"876543",  
				"111111",  
				"111111"};
		System.out.println(gridSearch(G, P));
	}
	public static String gridSearch(String[] G, String[] P) {
		int len = G.length, i=0, j=0;
		int index = 0, itemp = 0;
		while(i < len) {
			j=0;
			index = G[i].indexOf(P[j],0);
			itemp = i+1;
			j++;
			if(index != -1) {
				while(j<P.length && itemp<len) {
					if(G[itemp].indexOf(P[j],index) != index) {
						if(G[i].indexOf(P[0],index+1) != -1) {
							index=G[i].indexOf(P[0],index+1);
							itemp = i;
							j = 0;
						}
						else {
							break;
						}
					}
					j++;
					itemp++;
					if(j == P.length) {
						return "YES";
					}
				}
			}
			i++;
		}
		return "NO";
    }
}
