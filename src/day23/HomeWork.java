package day23;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
/*
Given two strings s and t ,
write a java program to determine if t is an anagram of s.

Example 1:
a:3
n:1
g:1
r:1
m:1
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

 */
public static void main(String[] args) {
    String s = "Johnny";
    String t = "Mohonny";

    System.out.println(areAnagrams(s, t));
}

    private static boolean areAnagrams(String s, String t)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char car: s.toCharArray())
            if(map.containsKey(car))
                map.put(car, map.get(car) + 1);

            else
                map.put(car, 1);

        for(char c: t.toCharArray())
            if(!map.containsKey(c))
                return false;

            else
            {
                map.put(c, map.get(c) - 1);

                if(map.get(c) == 0)
                    map.remove(c);
            }

        return map.isEmpty();
    }
}






