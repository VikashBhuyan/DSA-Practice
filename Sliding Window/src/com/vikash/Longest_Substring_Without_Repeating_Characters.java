package com.vikash;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_Without_Repeating_Characters {
	public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        int i = 0,j = 0;
        Map<Character, Integer> mp = new HashMap<>();
        int ans = 0;
        while(j<str.length){
            // Putting value into hashmap
            if(mp.containsKey(str[j])){
                mp.put(str[j],mp.get(str[j])+1);
            }
            else{
                mp.put(str[j],1);
            }
            
            // Checking based on condition with size of window j - i +1 
            if(mp.size()<j-i+1){
                
                while(mp.size()<j-i+1){
                    mp.put(str[i], mp.get(str[i]) - 1);
                    if (mp.get(str[i]) == 0) {
                        mp.remove(str[i]);
                        
                    }
                    i++;
                }
            }
            if(mp.size()==j-i+1){
                ans = Math.max(ans,mp.size());
                j++;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		String s2 = "eeydgwdykpv";
		System.out.println(lengthOfLongestSubstring(s1));
		System.out.println(lengthOfLongestSubstring(s2));
		
	}
}
