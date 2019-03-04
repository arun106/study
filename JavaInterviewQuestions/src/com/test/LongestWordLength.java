package com.test;

public class LongestWordLength {


    static int LongestWordLength(String str)
    {
       int n = str.length();
       int res = 0, curr_len = 0;
       for (int i=0; i<n; i++)
       {
          // If current character is not
          // end of current word.
          if (str.charAt(i) != ' ')
             curr_len++;
 
          // If end of word is found
          else
          {
             res = Math.max(res, curr_len);
             curr_len = 0;
          }
       }
 
       // We do max one more time to consider
       // last word as there won't be any space
       // after last word.
       return Math.max(res, curr_len);
    }
 
    public static void main(String[] args)
    {
        String s = "I am an intern at geeksforgeeks";
        System.out.println(LongestWordLength(s));
    }
}