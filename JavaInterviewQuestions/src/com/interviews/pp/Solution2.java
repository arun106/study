package com.interviews.pp;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		List<String> commands = new ArrayList<>();
		commands.add("GGGGR");
		commands.add("L");
		commands.add("G");
		commands.add("GRGL");

		System.out.println(doesCircleExist(commands));
	}
	public static List<String> doesCircleExist(List<String> commands) {
	    // Write your code here
		List<String> reslist = new ArrayList<>();
		for (String command: commands) {
			int x = 0, y = 0;
			int direction = 0;
			for (int j=0; j<4; j++) {
				for (int i=0; i<command.length(); i++) {
					if(command.charAt(i) == 'G') {
						if(direction%4 == 0) {
							y++;
						} else if (direction%2 == 0) {
							y--;
						} else if (direction%4 == 1) {
							x++;
						} else {
							x--;
						}
					}
					else if(command.charAt(i) == 'L') {
						direction--;
					}
					else if(command.charAt(i) == 'R') {
						direction++;
					}
				}
			}
			if(x==0 && y==0) {
				reslist.add("YES");
			} else {
				reslist.add("NO");
			}
		}
		return reslist;
	}
}
