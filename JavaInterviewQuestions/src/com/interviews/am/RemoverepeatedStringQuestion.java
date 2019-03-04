package com.interviews.am;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoverepeatedStringQuestion {

	
	/*
	 * Consider a list of strings
	 * The ask is to remove the repeating words and return a arraylist of strings
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li = new ArrayList<>();
		
		/*li.add("my name is arun");
		li.add("my name is name");
		li.add("my name is my");
		li.add("name arun name");*/
		li.add("abc");
		li.add("abc1");
		li.add("abc2");
		li.add("abc10");
		Collections.sort(li);
		System.out.println(li);
		
		//RemoverepeatedStringQuestion rem = new RemoverepeatedStringQuestion();
		//System.out.println(rem.removeRepeated(li));
		
	}
	public List<String> removeRepeated(List<String> li)
	{
		List<String> newli = new ArrayList<String>();
		ArrayList<String> strlist = new ArrayList<>();
		String newWord = "", addword = "";
		int j = 0;
		
		for (int i=0; i<li.size(); i++)
		{
			String str = li.get(i);
			j=0;
			addword = "";
			newWord = "";
			strlist.clear();

			while(j <= str.length())
			{
				if (j == str.length() || (str.charAt(j) == ' ' && !newWord.isEmpty()))
				{
					if(!strlist.contains(newWord))
					{
						strlist.add(newWord);
						if(!addword.isEmpty())
							addword += " " + newWord;
						else
							addword += newWord;
					}
					newWord = "";
				}
				else
					newWord += str.charAt(j);
				
				j++;
			}
			
			if(!addword.isEmpty())
			{
				newli.add(addword);
			}
		}
		
		return newli;
	}

}
