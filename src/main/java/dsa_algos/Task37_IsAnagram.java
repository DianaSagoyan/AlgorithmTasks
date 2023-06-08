package dsa_algos;

import java.util.HashMap;
import java.util.Map;

public class Task37_IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramgana";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){

        Map<Character, Integer> map = new HashMap<>();

        for(Character letter: s.toCharArray()){
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for(Character letter: t.toCharArray()){
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for(Integer num: map.values()){
            if(num % 2 != 0) return false;
        }
        return true;
    }
}
