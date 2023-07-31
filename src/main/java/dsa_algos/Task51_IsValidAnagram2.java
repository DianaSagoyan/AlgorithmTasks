package dsa_algos;

import java.util.HashMap;
import java.util.Map;

public class Task51_IsValidAnagram2 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaam";

        System.out.println(isValidAnagrma(s, t));
    }

    public static boolean isValidAnagrma(String s, String t){

        if(s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for(char ch: s.toCharArray()) mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        for(char ch: t.toCharArray()) mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);

        for(Map.Entry<Character, Integer> entry: mapS.entrySet()){
            if(mapS.get(entry.getKey()) != mapT.get(entry.getKey())) return false;
        }

        return true;
    }
}
