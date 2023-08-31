package dsa_algos;

import java.util.*;

public class Task70_GroupAnagrams {
    public static void main(String[] args) {
        //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        //
        //An Anagram is a word or phrase formed by rearranging the letters of a different
        // word or phrase, typically using all the original letters exactly once.

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(String each: strs){
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            
            if(map.containsKey(newStr)){
                map.get(newStr).add(each);
            } else {
                List<String> list = new ArrayList<>();
                list.add(each);
                map.put(newStr, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
